/*
 * freee API
 *  <h1 id=\"freee_api\">freee API</h1> <hr /> <h2 id=\"start_guide\">スタートガイド</h2>  <p>freee API開発がはじめての方は<a href=\"https://developer.freee.co.jp/getting-started\">freee API スタートガイド</a>を参照してください。</p>  <hr /> <h2 id=\"specification\">仕様</h2>  <pre><code>【重要】会計freee APIの新バージョンについて 2020年12月まで、2つのバージョンが利用できる状態です。古いものは2020年12月に利用不可となります。<br> 新しいAPIを利用するにはリクエストヘッダーに以下を指定します。 X-Api-Version: 2020-06-15<br> 指定がない場合は2020年12月に廃止予定のAPIを利用することとなります。<br> 【重要】APIのバージョン指定をせずに利用し続ける場合 2020年12月に新しいバージョンのAPIに自動的に切り替わります。 詳細は、<a href=\"https://developer.freee.co.jp/release-note/2948\" target=\"_blank\">リリースノート</a>をご覧ください。<br> 旧バージョンのAPIリファレンスを確認したい場合は、<a href=\"https://freee.github.io/freee-api-schema/\" target=\"_blank\">旧バージョンのAPIリファレンスページ</a>をご覧ください。 </code></pre>  <h3 id=\"api_endpoint\">APIエンドポイント</h3>  <p>https://api.freee.co.jp/ (httpsのみ)</p>  <h3 id=\"about_authorize\">認証について</h3> <p>OAuth2.0を利用します。詳細は<a href=\"https://developer.freee.co.jp/docs\" target=\"_blank\">ドキュメントの認証</a>パートを参照してください。</p>  <h3 id=\"data_format\">データフォーマット</h3>  <p>リクエスト、レスポンスともにJSON形式をサポートしていますが、詳細は、API毎の説明欄（application/jsonなど）を確認してください。</p>  <h3 id=\"compatibility\">後方互換性ありの変更</h3>  <p>freeeでは、APIを改善していくために以下のような変更は後方互換性ありとして通知なく変更を入れることがあります。アプリケーション実装者は以下を踏まえて開発を行ってください。</p>  <ul> <li>新しいAPIリソース・エンドポイントの追加</li> <li>既存のAPIに対して必須ではない新しいリクエストパラメータの追加</li> <li>既存のAPIレスポンスに対する新しいプロパティの追加</li> <li>既存のAPIレスポンスに対するプロパティの順番の入れ変え</li> <li>keyとなっているidやcodeの長さの変更（長くする）</li> </ul>  <h3 id=\"common_response_header\">共通レスポンスヘッダー</h3>  <p>すべてのAPIのレスポンスには以下のHTTPヘッダーが含まれます。</p>  <ul> <li> <p>X-Freee-Request-ID</p> <ul> <li>各リクエスト毎に発行されるID</li> </ul> </li> </ul>  <h3 id=\"common_error_response\">共通エラーレスポンス</h3>  <ul> <li> <p>ステータスコードはレスポンス内のJSONに含まれる他、HTTPヘッダにも含まれる</p> </li> <li> <p>一部のエラーレスポンスにはエラーコードが含まれます。<br>詳細は、<a href=\"https://developer.freee.co.jp/tips/faq/40x-checkpoint\">HTTPステータスコード400台エラー時のチェックポイント</a>を参照してください</p> </li> <p>type</p>  <ul> <li>status : HTTPステータスコードの説明</li>  <li>validation : エラーの詳細の説明（開発者向け）</li> </ul> </li> </ul>  <p>レスポンスの例</p>  <pre><code>  {     &quot;status_code&quot; : 400,     &quot;errors&quot; : [       {         &quot;type&quot; : &quot;status&quot;,         &quot;messages&quot; : [&quot;不正なリクエストです。&quot;]       },       {         &quot;type&quot; : &quot;validation&quot;,         &quot;messages&quot; : [&quot;Date は不正な日付フォーマットです。入力例：2013-01-01&quot;]       }     ]   }</code></pre>  </br>  <h3 id=\"api_rate_limit\">API使用制限</h3>    <p>freeeは一定期間に過度のアクセスを検知した場合、APIアクセスをコントロールする場合があります。</p>   <p>その際のhttp status codeは403となります。制限がかかってから10分程度が過ぎると再度使用することができるようになります。</p>  <h4 id=\"reports_api_endpoint\">/reportsエンドポイント</h4>  <p>freeeは/reportsエンドポイントに対して1秒間に10以上のアクセスを検知した場合、APIアクセスをコントロールする場合があります。その際のhttp status codeは429（too many requests）となります。</p>  <p>レスポンスボディのmetaプロパティに以下を含めます。</p>  <ul>   <li>設定されている上限値</li>   <li>上限に達するまでの使用可能回数</li>   <li>（上限値に達した場合）使用回数がリセットされる時刻</li> </ul>  <h3 id=\"plan_api_rate_limit\">プラン別のAPI Rate Limit</h3>   <table border=\"1\">     <tbody>       <tr>         <th style=\"padding: 10px\"><strong>会計freeeプラン名</strong></th>         <th style=\"padding: 10px\"><strong>事業所とアプリケーション毎に1日でのAPIコール数</strong></th>       </tr>       <tr>         <td style=\"padding: 10px\">エンタープライズ</td>         <td style=\"padding: 10px\">10,000</td>       </tr>       <tr>         <td style=\"padding: 10px\">プロフェッショナル</td>         <td style=\"padding: 10px\">5,000</td>       </tr>       <tr>         <td style=\"padding: 10px\">ベーシック</td>         <td style=\"padding: 10px\">3,000</td>       </tr>       <tr>         <td style=\"padding: 10px\">ミニマム</td>         <td style=\"padding: 10px\">3,000</td>       </tr>       <tr>         <td style=\"padding: 10px\">上記以外</td>         <td style=\"padding: 10px\">3,000</td>       </tr>     </tbody>   </table>  <h3 id=\"webhook\">Webhookについて</h3>  <p>詳細は<a href=\"https://developer.freee.co.jp/docs/accounting/webhook\" target=\"_blank\">会計Webhook概要</a>を参照してください。</p>  <hr /> <h2 id=\"contact\">連絡先</h2>  <p>ご不明点、ご要望等は <a href=\"https://support.freee.co.jp/hc/ja/requests/new\">freee サポートデスクへのお問い合わせフォーム</a> からご連絡ください。</p> <hr />&copy; Since 2013 freee K.K.
 *
 * The version of the OpenAPI document: v1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.freee.accounting.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jp.co.freee.accounting.models.ApprovalRequestFormParts;

/**
 * ApprovalRequestForm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApprovalRequestForm {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_CREATED_DATE = "created_date";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private String createdDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FORM_ORDER = "form_order";
  @SerializedName(SERIALIZED_NAME_FORM_ORDER)
  private Integer formOrder;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARTS = "parts";
  @SerializedName(SERIALIZED_NAME_PARTS)
  private List<ApprovalRequestFormParts> parts = null;

  public static final String SERIALIZED_NAME_ROUTE_SETTING_COUNT = "route_setting_count";
  @SerializedName(SERIALIZED_NAME_ROUTE_SETTING_COUNT)
  private Integer routeSettingCount;

  /**
   * ステータス(draft: 申請で使用しない、active: 申請で使用する、deleted: 削除済み)
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("draft"),
    
    ACTIVE("active"),
    
    DELETED("deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;


  public ApprovalRequestForm companyId(Integer companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 事業所ID
   * minimum: 1
   * maximum: 2147483647
   * @return companyId
  **/
  @ApiModelProperty(example = "1", required = true, value = "事業所ID")

  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  public ApprovalRequestForm createdDate(String createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * 作成日時
   * @return createdDate
  **/
  @ApiModelProperty(example = "2018-09-10T13:47:24.000+09:00", required = true, value = "作成日時")

  public String getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  public ApprovalRequestForm description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 申請フォームの説明
   * @return description
  **/
  @ApiModelProperty(example = "申請フォームの説明", required = true, value = "申請フォームの説明")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ApprovalRequestForm formOrder(Integer formOrder) {
    
    this.formOrder = formOrder;
    return this;
  }

   /**
   * 表示順（申請者が選択する申請フォームの表示順を設定できます。小さい数ほど上位に表示されます。（0を除く整数のみ。マイナス不可）未入力の場合、表示順が後ろになります。同じ数字が入力された場合、登録順で表示されます。）
   * minimum: 1
   * maximum: 1000
   * @return formOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "表示順（申請者が選択する申請フォームの表示順を設定できます。小さい数ほど上位に表示されます。（0を除く整数のみ。マイナス不可）未入力の場合、表示順が後ろになります。同じ数字が入力された場合、登録順で表示されます。）")

  public Integer getFormOrder() {
    return formOrder;
  }


  public void setFormOrder(Integer formOrder) {
    this.formOrder = formOrder;
  }


  public ApprovalRequestForm id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 申請フォームID
   * minimum: 1
   * maximum: 2147483647
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "申請フォームID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ApprovalRequestForm name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 申請フォームの名前
   * @return name
  **/
  @ApiModelProperty(example = "申請フォームの名前", required = true, value = "申請フォームの名前")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApprovalRequestForm parts(List<ApprovalRequestFormParts> parts) {
    
    this.parts = parts;
    return this;
  }

  public ApprovalRequestForm addPartsItem(ApprovalRequestFormParts partsItem) {
    if (this.parts == null) {
      this.parts = new ArrayList<>();
    }
    this.parts.add(partsItem);
    return this;
  }

   /**
   * 申請フォームの項目
   * @return parts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "申請フォームの項目")

  public List<ApprovalRequestFormParts> getParts() {
    return parts;
  }


  public void setParts(List<ApprovalRequestFormParts> parts) {
    this.parts = parts;
  }


  public ApprovalRequestForm routeSettingCount(Integer routeSettingCount) {
    
    this.routeSettingCount = routeSettingCount;
    return this;
  }

   /**
   * 適用された経路数
   * minimum: 0
   * maximum: 2147483647
   * @return routeSettingCount
  **/
  @ApiModelProperty(example = "1", required = true, value = "適用された経路数")

  public Integer getRouteSettingCount() {
    return routeSettingCount;
  }


  public void setRouteSettingCount(Integer routeSettingCount) {
    this.routeSettingCount = routeSettingCount;
  }


  public ApprovalRequestForm status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * ステータス(draft: 申請で使用しない、active: 申請で使用する、deleted: 削除済み)
   * @return status
  **/
  @ApiModelProperty(example = "active", required = true, value = "ステータス(draft: 申請で使用しない、active: 申請で使用する、deleted: 削除済み)")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalRequestForm approvalRequestForm = (ApprovalRequestForm) o;
    return Objects.equals(this.companyId, approvalRequestForm.companyId) &&
        Objects.equals(this.createdDate, approvalRequestForm.createdDate) &&
        Objects.equals(this.description, approvalRequestForm.description) &&
        Objects.equals(this.formOrder, approvalRequestForm.formOrder) &&
        Objects.equals(this.id, approvalRequestForm.id) &&
        Objects.equals(this.name, approvalRequestForm.name) &&
        Objects.equals(this.parts, approvalRequestForm.parts) &&
        Objects.equals(this.routeSettingCount, approvalRequestForm.routeSettingCount) &&
        Objects.equals(this.status, approvalRequestForm.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, createdDate, description, formOrder, id, name, parts, routeSettingCount, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalRequestForm {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    formOrder: ").append(toIndentedString(formOrder)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    routeSettingCount: ").append(toIndentedString(routeSettingCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

