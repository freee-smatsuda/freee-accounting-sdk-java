/**
 * Copyright (c) freee K.K. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package jp.co.freee.accounting;

import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import jp.co.freee.accounting.models.CreateWalletableParams;
import jp.co.freee.accounting.models.WalletablesCreateResponse;
import jp.co.freee.accounting.models.WalletablesIndexResponse;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Walletables.
 */
public interface Walletables {
    /**
     * 口座一覧の取得.
     * 指定した事業所の口座一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WalletablesIndexResponse object if successful.
     */
    WalletablesIndexResponse list(int companyId);

    /**
     * 口座一覧の取得.
     * 指定した事業所の口座一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<WalletablesIndexResponse> listAsync(int companyId, final ServiceCallback<WalletablesIndexResponse> serviceCallback);

    /**
     * 口座一覧の取得.
     * 指定した事業所の口座一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletablesIndexResponse object
     */
    Observable<WalletablesIndexResponse> listAsync(int companyId);

    /**
     * 口座一覧の取得.
     * 指定した事業所の口座一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletablesIndexResponse object
     */
    Observable<ServiceResponse<WalletablesIndexResponse>> listWithServiceResponseAsync(int companyId);
    /**
     * 口座一覧の取得.
     * 指定した事業所の口座一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param withBalance 残高情報を含める
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WalletablesIndexResponse object if successful.
     */
    WalletablesIndexResponse list(int companyId, Boolean withBalance);

    /**
     * 口座一覧の取得.
     * 指定した事業所の口座一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param withBalance 残高情報を含める
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<WalletablesIndexResponse> listAsync(int companyId, Boolean withBalance, final ServiceCallback<WalletablesIndexResponse> serviceCallback);

    /**
     * 口座一覧の取得.
     * 指定した事業所の口座一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param withBalance 残高情報を含める
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletablesIndexResponse object
     */
    Observable<WalletablesIndexResponse> listAsync(int companyId, Boolean withBalance);

    /**
     * 口座一覧の取得.
     * 指定した事業所の口座一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param withBalance 残高情報を含める
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletablesIndexResponse object
     */
    Observable<ServiceResponse<WalletablesIndexResponse>> listWithServiceResponseAsync(int companyId, Boolean withBalance);

    /**
     * 口座の作成.
     * 指定した事業所に口座を作成する.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WalletablesCreateResponse object if successful.
     */
    WalletablesCreateResponse create();

    /**
     * 口座の作成.
     * 指定した事業所に口座を作成する.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<WalletablesCreateResponse> createAsync(final ServiceCallback<WalletablesCreateResponse> serviceCallback);

    /**
     * 口座の作成.
     * 指定した事業所に口座を作成する.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletablesCreateResponse object
     */
    Observable<WalletablesCreateResponse> createAsync();

    /**
     * 口座の作成.
     * 指定した事業所に口座を作成する.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletablesCreateResponse object
     */
    Observable<ServiceResponse<WalletablesCreateResponse>> createWithServiceResponseAsync();
    /**
     * 口座の作成.
     * 指定した事業所に口座を作成する.
     *
     * @param parameters 口座の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WalletablesCreateResponse object if successful.
     */
    WalletablesCreateResponse create(CreateWalletableParams parameters);

    /**
     * 口座の作成.
     * 指定した事業所に口座を作成する.
     *
     * @param parameters 口座の作成
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<WalletablesCreateResponse> createAsync(CreateWalletableParams parameters, final ServiceCallback<WalletablesCreateResponse> serviceCallback);

    /**
     * 口座の作成.
     * 指定した事業所に口座を作成する.
     *
     * @param parameters 口座の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletablesCreateResponse object
     */
    Observable<WalletablesCreateResponse> createAsync(CreateWalletableParams parameters);

    /**
     * 口座の作成.
     * 指定した事業所に口座を作成する.
     *
     * @param parameters 口座の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletablesCreateResponse object
     */
    Observable<ServiceResponse<WalletablesCreateResponse>> createWithServiceResponseAsync(CreateWalletableParams parameters);

}