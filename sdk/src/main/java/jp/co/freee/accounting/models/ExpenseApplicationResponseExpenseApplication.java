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
import jp.co.freee.accounting.models.ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines;

/**
 * ExpenseApplicationResponseExpenseApplication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpenseApplicationResponseExpenseApplication {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_DEAL_ID = "deal_id";
  @SerializedName(SERIALIZED_NAME_DEAL_ID)
  private Integer dealId;

  /**
   * 取引ステータス (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_statusが表示されます settled:精算済み, unsettled:清算待ち)
   */
  @JsonAdapter(DealStatusEnum.Adapter.class)
  public enum DealStatusEnum {
    SETTLED("settled"),
    
    UNSETTLED("unsettled");

    private String value;

    DealStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DealStatusEnum fromValue(String value) {
      for (DealStatusEnum b : DealStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DealStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DealStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DealStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DealStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEAL_STATUS = "deal_status";
  @SerializedName(SERIALIZED_NAME_DEAL_STATUS)
  private DealStatusEnum dealStatus;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EDITABLE_ON_WEB = "editable_on_web";
  @SerializedName(SERIALIZED_NAME_EDITABLE_ON_WEB)
  private Boolean editableOnWeb;

  public static final String SERIALIZED_NAME_EXPENSE_APPLICATION_LINES = "expense_application_lines";
  @SerializedName(SERIALIZED_NAME_EXPENSE_APPLICATION_LINES)
  private List<ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines> expenseApplicationLines = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issue_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  public static final String SERIALIZED_NAME_SECTION_ID = "section_id";
  @SerializedName(SERIALIZED_NAME_SECTION_ID)
  private Integer sectionId;

  /**
   * 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し)
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("draft"),
    
    IN_PROGRESS("in_progress"),
    
    APPROVED("approved"),
    
    REJECTED("rejected"),
    
    FEEDBACK("feedback");

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

  public static final String SERIALIZED_NAME_TAG_IDS = "tag_ids";
  @SerializedName(SERIALIZED_NAME_TAG_IDS)
  private List<Integer> tagIds = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Integer totalAmount;


  public ExpenseApplicationResponseExpenseApplication companyId(Integer companyId) {
    
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


  public ExpenseApplicationResponseExpenseApplication dealId(Integer dealId) {
    
    this.dealId = dealId;
    return this;
  }

   /**
   * 取引ID (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_idが表示されます)
   * minimum: 1
   * maximum: 2147483647
   * @return dealId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "取引ID (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_idが表示されます)")

  public Integer getDealId() {
    return dealId;
  }


  public void setDealId(Integer dealId) {
    this.dealId = dealId;
  }


  public ExpenseApplicationResponseExpenseApplication dealStatus(DealStatusEnum dealStatus) {
    
    this.dealStatus = dealStatus;
    return this;
  }

   /**
   * 取引ステータス (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_statusが表示されます settled:精算済み, unsettled:清算待ち)
   * @return dealStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "settled", required = true, value = "取引ステータス (申請ステータス:statusがapprovedで、取引が存在する時のみdeal_statusが表示されます settled:精算済み, unsettled:清算待ち)")

  public DealStatusEnum getDealStatus() {
    return dealStatus;
  }


  public void setDealStatus(DealStatusEnum dealStatus) {
    this.dealStatus = dealStatus;
  }


  public ExpenseApplicationResponseExpenseApplication description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 備考
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "◯◯連携先ID: cx12345", value = "備考")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ExpenseApplicationResponseExpenseApplication editableOnWeb(Boolean editableOnWeb) {
    
    this.editableOnWeb = editableOnWeb;
    return this;
  }

   /**
   * 会計freeeのWeb画面から申請内容を編集可能：falseの場合、Web上からの項目行の追加／削除・金額の編集が出来なくなります。APIでの編集は可能です。
   * @return editableOnWeb
  **/
  @ApiModelProperty(example = "false", required = true, value = "会計freeeのWeb画面から申請内容を編集可能：falseの場合、Web上からの項目行の追加／削除・金額の編集が出来なくなります。APIでの編集は可能です。")

  public Boolean getEditableOnWeb() {
    return editableOnWeb;
  }


  public void setEditableOnWeb(Boolean editableOnWeb) {
    this.editableOnWeb = editableOnWeb;
  }


  public ExpenseApplicationResponseExpenseApplication expenseApplicationLines(List<ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines> expenseApplicationLines) {
    
    this.expenseApplicationLines = expenseApplicationLines;
    return this;
  }

  public ExpenseApplicationResponseExpenseApplication addExpenseApplicationLinesItem(ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines expenseApplicationLinesItem) {
    this.expenseApplicationLines.add(expenseApplicationLinesItem);
    return this;
  }

   /**
   * 経費申請の項目行一覧（配列）
   * @return expenseApplicationLines
  **/
  @ApiModelProperty(required = true, value = "経費申請の項目行一覧（配列）")

  public List<ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines> getExpenseApplicationLines() {
    return expenseApplicationLines;
  }


  public void setExpenseApplicationLines(List<ExpenseApplicationResponseExpenseApplicationExpenseApplicationLines> expenseApplicationLines) {
    this.expenseApplicationLines = expenseApplicationLines;
  }


  public ExpenseApplicationResponseExpenseApplication id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 経費申請ID
   * minimum: 1
   * maximum: 2147483647
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "経費申請ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ExpenseApplicationResponseExpenseApplication issueDate(String issueDate) {
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * 申請日 (yyyy-mm-dd)
   * @return issueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-07-19", required = true, value = "申請日 (yyyy-mm-dd)")

  public String getIssueDate() {
    return issueDate;
  }


  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public ExpenseApplicationResponseExpenseApplication sectionId(Integer sectionId) {
    
    this.sectionId = sectionId;
    return this;
  }

   /**
   * 部門ID
   * minimum: 1
   * maximum: 2147483647
   * @return sectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "101", value = "部門ID")

  public Integer getSectionId() {
    return sectionId;
  }


  public void setSectionId(Integer sectionId) {
    this.sectionId = sectionId;
  }


  public ExpenseApplicationResponseExpenseApplication status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * 申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し)
   * @return status
  **/
  @ApiModelProperty(example = "draft", required = true, value = "申請ステータス(draft:下書き, in_progress:申請中, approved:承認済, rejected:却下, feedback:差戻し)")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ExpenseApplicationResponseExpenseApplication tagIds(List<Integer> tagIds) {
    
    this.tagIds = tagIds;
    return this;
  }

  public ExpenseApplicationResponseExpenseApplication addTagIdsItem(Integer tagIdsItem) {
    if (this.tagIds == null) {
      this.tagIds = new ArrayList<>();
    }
    this.tagIds.add(tagIdsItem);
    return this;
  }

   /**
   * メモタグID
   * @return tagIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "メモタグID")

  public List<Integer> getTagIds() {
    return tagIds;
  }


  public void setTagIds(List<Integer> tagIds) {
    this.tagIds = tagIds;
  }


  public ExpenseApplicationResponseExpenseApplication title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 申請タイトル
   * @return title
  **/
  @ApiModelProperty(example = "大阪出張", required = true, value = "申請タイトル")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ExpenseApplicationResponseExpenseApplication totalAmount(Integer totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 合計金額
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30000", value = "合計金額")

  public Integer getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseApplicationResponseExpenseApplication expenseApplicationResponseExpenseApplication = (ExpenseApplicationResponseExpenseApplication) o;
    return Objects.equals(this.companyId, expenseApplicationResponseExpenseApplication.companyId) &&
        Objects.equals(this.dealId, expenseApplicationResponseExpenseApplication.dealId) &&
        Objects.equals(this.dealStatus, expenseApplicationResponseExpenseApplication.dealStatus) &&
        Objects.equals(this.description, expenseApplicationResponseExpenseApplication.description) &&
        Objects.equals(this.editableOnWeb, expenseApplicationResponseExpenseApplication.editableOnWeb) &&
        Objects.equals(this.expenseApplicationLines, expenseApplicationResponseExpenseApplication.expenseApplicationLines) &&
        Objects.equals(this.id, expenseApplicationResponseExpenseApplication.id) &&
        Objects.equals(this.issueDate, expenseApplicationResponseExpenseApplication.issueDate) &&
        Objects.equals(this.sectionId, expenseApplicationResponseExpenseApplication.sectionId) &&
        Objects.equals(this.status, expenseApplicationResponseExpenseApplication.status) &&
        Objects.equals(this.tagIds, expenseApplicationResponseExpenseApplication.tagIds) &&
        Objects.equals(this.title, expenseApplicationResponseExpenseApplication.title) &&
        Objects.equals(this.totalAmount, expenseApplicationResponseExpenseApplication.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, dealId, dealStatus, description, editableOnWeb, expenseApplicationLines, id, issueDate, sectionId, status, tagIds, title, totalAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseApplicationResponseExpenseApplication {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    dealStatus: ").append(toIndentedString(dealStatus)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editableOnWeb: ").append(toIndentedString(editableOnWeb)).append("\n");
    sb.append("    expenseApplicationLines: ").append(toIndentedString(expenseApplicationLines)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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

