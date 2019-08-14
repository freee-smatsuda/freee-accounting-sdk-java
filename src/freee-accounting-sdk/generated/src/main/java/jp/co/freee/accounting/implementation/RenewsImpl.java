/**
 * Copyright (c) freee K.K. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package jp.co.freee.accounting.implementation;

import retrofit2.Retrofit;
import jp.co.freee.accounting.Renews;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import jp.co.freee.accounting.models.RenewsCreateParams;
import jp.co.freee.accounting.models.RenewsResponse;
import jp.co.freee.accounting.models.RenewsUpdateParams;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Renews.
 */
public class RenewsImpl implements Renews {
    /** The Retrofit service to perform REST calls. */
    private RenewsService service;
    /** The service client containing this operation class. */
    private AccountingClientImpl client;

    /**
     * Initializes an instance of Renews.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RenewsImpl(Retrofit retrofit, AccountingClientImpl client) {
        this.service = retrofit.create(RenewsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Renews to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RenewsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.Renews createDeal" })
        @POST("deals/{id}/renews")
        Observable<Response<ResponseBody>> createDeal(@Path("id") int id, @Body RenewsCreateParams parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.Renews updateDeal" })
        @PUT("deals/{id}/renews/{renew_id}")
        Observable<Response<ResponseBody>> updateDeal(@Path("id") int id, @Path("renew_id") int renewId, @Body RenewsUpdateParams parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.Renews deleteDeal" })
        @HTTP(path = "deals/{id}/renews/{renew_id}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteDeal(@Path("id") int id, @Path("renew_id") int renewId, @Query("company_id") int companyId);

    }

    /**
     * 取引（収入／支出）に対する+更新の作成.
     * 指定した事業所の取引（収入／支出）の+更新を作成する.
     *
     * @param id 取引ID
     * @param parameters 取引（収入／支出）に対する+更新の情報
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RenewsResponse object if successful.
     */
    public RenewsResponse createDeal(int id, RenewsCreateParams parameters) {
        return createDealWithServiceResponseAsync(id, parameters).toBlocking().single().body();
    }

    /**
     * 取引（収入／支出）に対する+更新の作成.
     * 指定した事業所の取引（収入／支出）の+更新を作成する.
     *
     * @param id 取引ID
     * @param parameters 取引（収入／支出）に対する+更新の情報
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RenewsResponse> createDealAsync(int id, RenewsCreateParams parameters, final ServiceCallback<RenewsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createDealWithServiceResponseAsync(id, parameters), serviceCallback);
    }

    /**
     * 取引（収入／支出）に対する+更新の作成.
     * 指定した事業所の取引（収入／支出）の+更新を作成する.
     *
     * @param id 取引ID
     * @param parameters 取引（収入／支出）に対する+更新の情報
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RenewsResponse object
     */
    public Observable<RenewsResponse> createDealAsync(int id, RenewsCreateParams parameters) {
        return createDealWithServiceResponseAsync(id, parameters).map(new Func1<ServiceResponse<RenewsResponse>, RenewsResponse>() {
            @Override
            public RenewsResponse call(ServiceResponse<RenewsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 取引（収入／支出）に対する+更新の作成.
     * 指定した事業所の取引（収入／支出）の+更新を作成する.
     *
     * @param id 取引ID
     * @param parameters 取引（収入／支出）に対する+更新の情報
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RenewsResponse object
     */
    public Observable<ServiceResponse<RenewsResponse>> createDealWithServiceResponseAsync(int id, RenewsCreateParams parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.createDeal(id, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RenewsResponse>>>() {
                @Override
                public Observable<ServiceResponse<RenewsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RenewsResponse> clientResponse = createDealDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RenewsResponse> createDealDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RenewsResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<RenewsResponse>() { }.getType())
                .build(response);
    }

    /**
     * 取引（収入／支出）の+更新の更新.
     * 指定した事業所の取引（収入／支出）の+更新を更新する.
     *
     * @param id 取引ID
     * @param renewId +更新ID
     * @param parameters +更新の更新情報
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RenewsResponse object if successful.
     */
    public RenewsResponse updateDeal(int id, int renewId, RenewsUpdateParams parameters) {
        return updateDealWithServiceResponseAsync(id, renewId, parameters).toBlocking().single().body();
    }

    /**
     * 取引（収入／支出）の+更新の更新.
     * 指定した事業所の取引（収入／支出）の+更新を更新する.
     *
     * @param id 取引ID
     * @param renewId +更新ID
     * @param parameters +更新の更新情報
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RenewsResponse> updateDealAsync(int id, int renewId, RenewsUpdateParams parameters, final ServiceCallback<RenewsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(updateDealWithServiceResponseAsync(id, renewId, parameters), serviceCallback);
    }

    /**
     * 取引（収入／支出）の+更新の更新.
     * 指定した事業所の取引（収入／支出）の+更新を更新する.
     *
     * @param id 取引ID
     * @param renewId +更新ID
     * @param parameters +更新の更新情報
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RenewsResponse object
     */
    public Observable<RenewsResponse> updateDealAsync(int id, int renewId, RenewsUpdateParams parameters) {
        return updateDealWithServiceResponseAsync(id, renewId, parameters).map(new Func1<ServiceResponse<RenewsResponse>, RenewsResponse>() {
            @Override
            public RenewsResponse call(ServiceResponse<RenewsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 取引（収入／支出）の+更新の更新.
     * 指定した事業所の取引（収入／支出）の+更新を更新する.
     *
     * @param id 取引ID
     * @param renewId +更新ID
     * @param parameters +更新の更新情報
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RenewsResponse object
     */
    public Observable<ServiceResponse<RenewsResponse>> updateDealWithServiceResponseAsync(int id, int renewId, RenewsUpdateParams parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.updateDeal(id, renewId, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RenewsResponse>>>() {
                @Override
                public Observable<ServiceResponse<RenewsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RenewsResponse> clientResponse = updateDealDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RenewsResponse> updateDealDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RenewsResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RenewsResponse>() { }.getType())
                .build(response);
    }

    /**
     * 取引（収入／支出）の+更新の削除.
     * 指定した事業所の取引（収入／支出）の+更新を削除する.
     *
     * @param id 取引ID
     * @param renewId +更新ID
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RenewsResponse object if successful.
     */
    public RenewsResponse deleteDeal(int id, int renewId, int companyId) {
        return deleteDealWithServiceResponseAsync(id, renewId, companyId).toBlocking().single().body();
    }

    /**
     * 取引（収入／支出）の+更新の削除.
     * 指定した事業所の取引（収入／支出）の+更新を削除する.
     *
     * @param id 取引ID
     * @param renewId +更新ID
     * @param companyId 事業所ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RenewsResponse> deleteDealAsync(int id, int renewId, int companyId, final ServiceCallback<RenewsResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteDealWithServiceResponseAsync(id, renewId, companyId), serviceCallback);
    }

    /**
     * 取引（収入／支出）の+更新の削除.
     * 指定した事業所の取引（収入／支出）の+更新を削除する.
     *
     * @param id 取引ID
     * @param renewId +更新ID
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RenewsResponse object
     */
    public Observable<RenewsResponse> deleteDealAsync(int id, int renewId, int companyId) {
        return deleteDealWithServiceResponseAsync(id, renewId, companyId).map(new Func1<ServiceResponse<RenewsResponse>, RenewsResponse>() {
            @Override
            public RenewsResponse call(ServiceResponse<RenewsResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 取引（収入／支出）の+更新の削除.
     * 指定した事業所の取引（収入／支出）の+更新を削除する.
     *
     * @param id 取引ID
     * @param renewId +更新ID
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RenewsResponse object
     */
    public Observable<ServiceResponse<RenewsResponse>> deleteDealWithServiceResponseAsync(int id, int renewId, int companyId) {
        return service.deleteDeal(id, renewId, companyId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RenewsResponse>>>() {
                @Override
                public Observable<ServiceResponse<RenewsResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RenewsResponse> clientResponse = deleteDealDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RenewsResponse> deleteDealDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<RenewsResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RenewsResponse>() { }.getType())
                .build(response);
    }

}