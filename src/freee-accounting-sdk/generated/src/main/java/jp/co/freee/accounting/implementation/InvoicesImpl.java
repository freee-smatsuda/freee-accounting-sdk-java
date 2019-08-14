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
import jp.co.freee.accounting.Invoices;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import jp.co.freee.accounting.models.InvoicesCreateParams;
import jp.co.freee.accounting.models.InvoicesIndexResponse;
import jp.co.freee.accounting.models.InvoicesResponse;
import jp.co.freee.accounting.models.InvoicesUpdateParams;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
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
 * in Invoices.
 */
public class InvoicesImpl implements Invoices {
    /** The Retrofit service to perform REST calls. */
    private InvoicesService service;
    /** The service client containing this operation class. */
    private AccountingClientImpl client;

    /**
     * Initializes an instance of Invoices.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public InvoicesImpl(Retrofit retrofit, AccountingClientImpl client) {
        this.service = retrofit.create(InvoicesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Invoices to be
     * used by Retrofit to perform actually REST calls.
     */
    interface InvoicesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.Invoices list" })
        @GET("invoices")
        Observable<Response<ResponseBody>> list(@Query("company_id") int companyId, @Query("partner_id") Integer partnerId, @Query("partner_code") String partnerCode, @Query("issue_date_start") String issueDateStart, @Query("issue_date_end") String issueDateEnd, @Query("due_date_start") String dueDateStart, @Query("due_date_end") String dueDateEnd, @Query("invoice_number") String invoiceNumber, @Query("description") String description, @Query("invoice_status") String invoiceStatus, @Query("payment_status") String paymentStatus, @Query("offset") Integer offset, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.Invoices create" })
        @POST("invoices")
        Observable<Response<ResponseBody>> create(@Body InvoicesCreateParams parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.Invoices update" })
        @PUT("invoices/{id}")
        Observable<Response<ResponseBody>> update(@Path("id") int id, @Body InvoicesUpdateParams parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.Invoices destroy" })
        @HTTP(path = "invoices/{id}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> destroy(@Path("id") int id, @Query("company_id") int companyId);

    }

    /**
     * 請求書一覧の取得.
     * 指定した事業所の請求書一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InvoicesIndexResponse object if successful.
     */
    public InvoicesIndexResponse list(int companyId) {
        return listWithServiceResponseAsync(companyId).toBlocking().single().body();
    }

    /**
     * 請求書一覧の取得.
     * 指定した事業所の請求書一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InvoicesIndexResponse> listAsync(int companyId, final ServiceCallback<InvoicesIndexResponse> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(companyId), serviceCallback);
    }

    /**
     * 請求書一覧の取得.
     * 指定した事業所の請求書一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoicesIndexResponse object
     */
    public Observable<InvoicesIndexResponse> listAsync(int companyId) {
        return listWithServiceResponseAsync(companyId).map(new Func1<ServiceResponse<InvoicesIndexResponse>, InvoicesIndexResponse>() {
            @Override
            public InvoicesIndexResponse call(ServiceResponse<InvoicesIndexResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 請求書一覧の取得.
     * 指定した事業所の請求書一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoicesIndexResponse object
     */
    public Observable<ServiceResponse<InvoicesIndexResponse>> listWithServiceResponseAsync(int companyId) {
        final Integer partnerId = null;
        final String partnerCode = null;
        final String issueDateStart = null;
        final String issueDateEnd = null;
        final String dueDateStart = null;
        final String dueDateEnd = null;
        final String invoiceNumber = null;
        final String description = null;
        final String invoiceStatus = null;
        final String paymentStatus = null;
        final Integer offset = null;
        final Integer limit = null;
        return service.list(companyId, partnerId, partnerCode, issueDateStart, issueDateEnd, dueDateStart, dueDateEnd, invoiceNumber, description, invoiceStatus, paymentStatus, offset, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InvoicesIndexResponse>>>() {
                @Override
                public Observable<ServiceResponse<InvoicesIndexResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InvoicesIndexResponse> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 請求書一覧の取得.
     * 指定した事業所の請求書一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param partnerId 取引先IDで絞込
     * @param partnerCode 取引先コードで絞込
     * @param issueDateStart 請求日の開始日(yyyy-mm-dd)
     * @param issueDateEnd 請求日の終了日(yyyy-mm-dd)
     * @param dueDateStart 期日の開始日(yyyy-mm-dd)
     * @param dueDateEnd 期日の終了日(yyyy-mm-dd)
     * @param invoiceNumber 請求書番号
     * @param description 概要
     * @param invoiceStatus 請求書ステータス  (draft: 下書き, applying: 申請中, remanded: 差し戻し, rejected: 却下, approved: 承認済み, issued: 発行済み). Possible values include: 'draft', 'applying', 'remanded', 'rejected', 'approved', 'issued'
     * @param paymentStatus 入金ステータス  (unsettled: 入金待ち, settled: 入金済み). Possible values include: 'unsettled', 'settled'
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InvoicesIndexResponse object if successful.
     */
    public InvoicesIndexResponse list(int companyId, Integer partnerId, String partnerCode, String issueDateStart, String issueDateEnd, String dueDateStart, String dueDateEnd, String invoiceNumber, String description, String invoiceStatus, String paymentStatus, Integer offset, Integer limit) {
        return listWithServiceResponseAsync(companyId, partnerId, partnerCode, issueDateStart, issueDateEnd, dueDateStart, dueDateEnd, invoiceNumber, description, invoiceStatus, paymentStatus, offset, limit).toBlocking().single().body();
    }

    /**
     * 請求書一覧の取得.
     * 指定した事業所の請求書一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param partnerId 取引先IDで絞込
     * @param partnerCode 取引先コードで絞込
     * @param issueDateStart 請求日の開始日(yyyy-mm-dd)
     * @param issueDateEnd 請求日の終了日(yyyy-mm-dd)
     * @param dueDateStart 期日の開始日(yyyy-mm-dd)
     * @param dueDateEnd 期日の終了日(yyyy-mm-dd)
     * @param invoiceNumber 請求書番号
     * @param description 概要
     * @param invoiceStatus 請求書ステータス  (draft: 下書き, applying: 申請中, remanded: 差し戻し, rejected: 却下, approved: 承認済み, issued: 発行済み). Possible values include: 'draft', 'applying', 'remanded', 'rejected', 'approved', 'issued'
     * @param paymentStatus 入金ステータス  (unsettled: 入金待ち, settled: 入金済み). Possible values include: 'unsettled', 'settled'
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InvoicesIndexResponse> listAsync(int companyId, Integer partnerId, String partnerCode, String issueDateStart, String issueDateEnd, String dueDateStart, String dueDateEnd, String invoiceNumber, String description, String invoiceStatus, String paymentStatus, Integer offset, Integer limit, final ServiceCallback<InvoicesIndexResponse> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(companyId, partnerId, partnerCode, issueDateStart, issueDateEnd, dueDateStart, dueDateEnd, invoiceNumber, description, invoiceStatus, paymentStatus, offset, limit), serviceCallback);
    }

    /**
     * 請求書一覧の取得.
     * 指定した事業所の請求書一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param partnerId 取引先IDで絞込
     * @param partnerCode 取引先コードで絞込
     * @param issueDateStart 請求日の開始日(yyyy-mm-dd)
     * @param issueDateEnd 請求日の終了日(yyyy-mm-dd)
     * @param dueDateStart 期日の開始日(yyyy-mm-dd)
     * @param dueDateEnd 期日の終了日(yyyy-mm-dd)
     * @param invoiceNumber 請求書番号
     * @param description 概要
     * @param invoiceStatus 請求書ステータス  (draft: 下書き, applying: 申請中, remanded: 差し戻し, rejected: 却下, approved: 承認済み, issued: 発行済み). Possible values include: 'draft', 'applying', 'remanded', 'rejected', 'approved', 'issued'
     * @param paymentStatus 入金ステータス  (unsettled: 入金待ち, settled: 入金済み). Possible values include: 'unsettled', 'settled'
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoicesIndexResponse object
     */
    public Observable<InvoicesIndexResponse> listAsync(int companyId, Integer partnerId, String partnerCode, String issueDateStart, String issueDateEnd, String dueDateStart, String dueDateEnd, String invoiceNumber, String description, String invoiceStatus, String paymentStatus, Integer offset, Integer limit) {
        return listWithServiceResponseAsync(companyId, partnerId, partnerCode, issueDateStart, issueDateEnd, dueDateStart, dueDateEnd, invoiceNumber, description, invoiceStatus, paymentStatus, offset, limit).map(new Func1<ServiceResponse<InvoicesIndexResponse>, InvoicesIndexResponse>() {
            @Override
            public InvoicesIndexResponse call(ServiceResponse<InvoicesIndexResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 請求書一覧の取得.
     * 指定した事業所の請求書一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param partnerId 取引先IDで絞込
     * @param partnerCode 取引先コードで絞込
     * @param issueDateStart 請求日の開始日(yyyy-mm-dd)
     * @param issueDateEnd 請求日の終了日(yyyy-mm-dd)
     * @param dueDateStart 期日の開始日(yyyy-mm-dd)
     * @param dueDateEnd 期日の終了日(yyyy-mm-dd)
     * @param invoiceNumber 請求書番号
     * @param description 概要
     * @param invoiceStatus 請求書ステータス  (draft: 下書き, applying: 申請中, remanded: 差し戻し, rejected: 却下, approved: 承認済み, issued: 発行済み). Possible values include: 'draft', 'applying', 'remanded', 'rejected', 'approved', 'issued'
     * @param paymentStatus 入金ステータス  (unsettled: 入金待ち, settled: 入金済み). Possible values include: 'unsettled', 'settled'
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoicesIndexResponse object
     */
    public Observable<ServiceResponse<InvoicesIndexResponse>> listWithServiceResponseAsync(int companyId, Integer partnerId, String partnerCode, String issueDateStart, String issueDateEnd, String dueDateStart, String dueDateEnd, String invoiceNumber, String description, String invoiceStatus, String paymentStatus, Integer offset, Integer limit) {
        return service.list(companyId, partnerId, partnerCode, issueDateStart, issueDateEnd, dueDateStart, dueDateEnd, invoiceNumber, description, invoiceStatus, paymentStatus, offset, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InvoicesIndexResponse>>>() {
                @Override
                public Observable<ServiceResponse<InvoicesIndexResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InvoicesIndexResponse> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InvoicesIndexResponse> listDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<InvoicesIndexResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<InvoicesIndexResponse>() { }.getType())
                .build(response);
    }

    /**
     * 請求書の作成.
     * 指定した事業所の請求書を作成する.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InvoicesResponse object if successful.
     */
    public InvoicesResponse create() {
        return createWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * 請求書の作成.
     * 指定した事業所の請求書を作成する.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InvoicesResponse> createAsync(final ServiceCallback<InvoicesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * 請求書の作成.
     * 指定した事業所の請求書を作成する.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoicesResponse object
     */
    public Observable<InvoicesResponse> createAsync() {
        return createWithServiceResponseAsync().map(new Func1<ServiceResponse<InvoicesResponse>, InvoicesResponse>() {
            @Override
            public InvoicesResponse call(ServiceResponse<InvoicesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 請求書の作成.
     * 指定した事業所の請求書を作成する.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoicesResponse object
     */
    public Observable<ServiceResponse<InvoicesResponse>> createWithServiceResponseAsync() {
        final InvoicesCreateParams parameters = null;
        return service.create(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InvoicesResponse>>>() {
                @Override
                public Observable<ServiceResponse<InvoicesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InvoicesResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 請求書の作成.
     * 指定した事業所の請求書を作成する.
     *
     * @param parameters 請求書の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InvoicesResponse object if successful.
     */
    public InvoicesResponse create(InvoicesCreateParams parameters) {
        return createWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * 請求書の作成.
     * 指定した事業所の請求書を作成する.
     *
     * @param parameters 請求書の作成
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InvoicesResponse> createAsync(InvoicesCreateParams parameters, final ServiceCallback<InvoicesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * 請求書の作成.
     * 指定した事業所の請求書を作成する.
     *
     * @param parameters 請求書の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoicesResponse object
     */
    public Observable<InvoicesResponse> createAsync(InvoicesCreateParams parameters) {
        return createWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<InvoicesResponse>, InvoicesResponse>() {
            @Override
            public InvoicesResponse call(ServiceResponse<InvoicesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 請求書の作成.
     * 指定した事業所の請求書を作成する.
     *
     * @param parameters 請求書の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoicesResponse object
     */
    public Observable<ServiceResponse<InvoicesResponse>> createWithServiceResponseAsync(InvoicesCreateParams parameters) {
        Validator.validate(parameters);
        return service.create(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InvoicesResponse>>>() {
                @Override
                public Observable<ServiceResponse<InvoicesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InvoicesResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InvoicesResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<InvoicesResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<InvoicesResponse>() { }.getType())
                .build(response);
    }

    /**
     * 請求書の更新.
     * 指定した事業所の請求書を更新する.
     *
     * @param id 請求書ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InvoicesResponse object if successful.
     */
    public InvoicesResponse update(int id) {
        return updateWithServiceResponseAsync(id).toBlocking().single().body();
    }

    /**
     * 請求書の更新.
     * 指定した事業所の請求書を更新する.
     *
     * @param id 請求書ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InvoicesResponse> updateAsync(int id, final ServiceCallback<InvoicesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(id), serviceCallback);
    }

    /**
     * 請求書の更新.
     * 指定した事業所の請求書を更新する.
     *
     * @param id 請求書ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoicesResponse object
     */
    public Observable<InvoicesResponse> updateAsync(int id) {
        return updateWithServiceResponseAsync(id).map(new Func1<ServiceResponse<InvoicesResponse>, InvoicesResponse>() {
            @Override
            public InvoicesResponse call(ServiceResponse<InvoicesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 請求書の更新.
     * 指定した事業所の請求書を更新する.
     *
     * @param id 請求書ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoicesResponse object
     */
    public Observable<ServiceResponse<InvoicesResponse>> updateWithServiceResponseAsync(int id) {
        final InvoicesUpdateParams parameters = null;
        return service.update(id, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InvoicesResponse>>>() {
                @Override
                public Observable<ServiceResponse<InvoicesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InvoicesResponse> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 請求書の更新.
     * 指定した事業所の請求書を更新する.
     *
     * @param id 請求書ID
     * @param parameters 請求書の更新
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InvoicesResponse object if successful.
     */
    public InvoicesResponse update(int id, InvoicesUpdateParams parameters) {
        return updateWithServiceResponseAsync(id, parameters).toBlocking().single().body();
    }

    /**
     * 請求書の更新.
     * 指定した事業所の請求書を更新する.
     *
     * @param id 請求書ID
     * @param parameters 請求書の更新
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InvoicesResponse> updateAsync(int id, InvoicesUpdateParams parameters, final ServiceCallback<InvoicesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(id, parameters), serviceCallback);
    }

    /**
     * 請求書の更新.
     * 指定した事業所の請求書を更新する.
     *
     * @param id 請求書ID
     * @param parameters 請求書の更新
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoicesResponse object
     */
    public Observable<InvoicesResponse> updateAsync(int id, InvoicesUpdateParams parameters) {
        return updateWithServiceResponseAsync(id, parameters).map(new Func1<ServiceResponse<InvoicesResponse>, InvoicesResponse>() {
            @Override
            public InvoicesResponse call(ServiceResponse<InvoicesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 請求書の更新.
     * 指定した事業所の請求書を更新する.
     *
     * @param id 請求書ID
     * @param parameters 請求書の更新
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoicesResponse object
     */
    public Observable<ServiceResponse<InvoicesResponse>> updateWithServiceResponseAsync(int id, InvoicesUpdateParams parameters) {
        Validator.validate(parameters);
        return service.update(id, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InvoicesResponse>>>() {
                @Override
                public Observable<ServiceResponse<InvoicesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InvoicesResponse> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InvoicesResponse> updateDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<InvoicesResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<InvoicesResponse>() { }.getType())
                .build(response);
    }

    /**
     * 請求書の削除.
     * 指定した事業所の請求書を削除する.
     *
     * @param id the int value
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void destroy(int id, int companyId) {
        destroyWithServiceResponseAsync(id, companyId).toBlocking().single().body();
    }

    /**
     * 請求書の削除.
     * 指定した事業所の請求書を削除する.
     *
     * @param id the int value
     * @param companyId 事業所ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> destroyAsync(int id, int companyId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(destroyWithServiceResponseAsync(id, companyId), serviceCallback);
    }

    /**
     * 請求書の削除.
     * 指定した事業所の請求書を削除する.
     *
     * @param id the int value
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> destroyAsync(int id, int companyId) {
        return destroyWithServiceResponseAsync(id, companyId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 請求書の削除.
     * 指定した事業所の請求書を削除する.
     *
     * @param id the int value
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> destroyWithServiceResponseAsync(int id, int companyId) {
        return service.destroy(id, companyId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = destroyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> destroyDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}