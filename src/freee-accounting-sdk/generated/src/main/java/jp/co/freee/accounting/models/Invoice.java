/**
 * Copyright (c) freee K.K. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package jp.co.freee.accounting.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Invoice model.
 */
public class Invoice {
    /**
     * 請求書ID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /**
     * 事業所ID.
     */
    @JsonProperty(value = "company_id", required = true)
    private int companyId;

    /**
     * 請求日 (yyyy-mm-dd).
     */
    @JsonProperty(value = "issue_date", required = true)
    private String issueDate;

    /**
     * 取引先ID.
     */
    @JsonProperty(value = "partner_id", required = true)
    private Integer partnerId;

    /**
     * 取引先コード.
     */
    @JsonProperty(value = "partner_code")
    private String partnerCode;

    /**
     * 請求書番号.
     */
    @JsonProperty(value = "invoice_number", required = true)
    private String invoiceNumber;

    /**
     * タイトル.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * 期日 (yyyy-mm-dd).
     */
    @JsonProperty(value = "due_date")
    private String dueDate;

    /**
     * 合計金額.
     */
    @JsonProperty(value = "total_amount", required = true)
    private int totalAmount;

    /**
     * 合計金額.
     */
    @JsonProperty(value = "total_vat")
    private Integer totalVat;

    /**
     * 小計.
     */
    @JsonProperty(value = "sub_total")
    private Integer subTotal;

    /**
     * 売上計上日.
     */
    @JsonProperty(value = "booking_date")
    private String bookingDate;

    /**
     * 概要.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * 請求書ステータス  (draft: 下書き, applying: 申請中, remanded: 差し戻し, rejected: 却下,
     * approved: 承認済み, issued: 発行済み). Possible values include: 'draft',
     * 'applying', 'remanded', 'rejected', 'approved', 'issued'.
     */
    @JsonProperty(value = "invoice_status", required = true)
    private String invoiceStatus;

    /**
     * 入金ステータス  (unsettled: 入金待ち, settled: 入金済み). Possible values include: '',
     * 'unsettled', 'settled'.
     */
    @JsonProperty(value = "payment_status")
    private String paymentStatus;

    /**
     * 入金日.
     */
    @JsonProperty(value = "payment_date")
    private String paymentDate;

    /**
     * Web共有日時(最新).
     */
    @JsonProperty(value = "web_published_at")
    private String webPublishedAt;

    /**
     * Web共有ダウンロード日時(最新).
     */
    @JsonProperty(value = "web_downloaded_at")
    private String webDownloadedAt;

    /**
     * Web共有取引先確認日時(最新).
     */
    @JsonProperty(value = "web_confirmed_at")
    private String webConfirmedAt;

    /**
     * メール送信日時(最新).
     */
    @JsonProperty(value = "mail_sent_at")
    private String mailSentAt;

    /**
     * 郵送ステータス(unrequested: リクエスト前, preview_registered: プレビュー登録,
     * preview_failed: プレビュー登録失敗, ordered: 注文中, order_failed: 注文失敗, printing:
     * 印刷中, canceled: キャンセル, posted: 投函済み). Possible values include: '',
     * 'unrequested', 'preview_registered', 'preview_failed', 'ordered',
     * 'order_failed', 'printing', 'canceled', 'posted'.
     */
    @JsonProperty(value = "posting_status", required = true)
    private String postingStatus;

    /**
     * 取引先名.
     */
    @JsonProperty(value = "partner_name")
    private String partnerName;

    /**
     * 取引先正式名称.
     */
    @JsonProperty(value = "partner_long_name")
    private String partnerLongName;

    /**
     * 敬称（御中、様、(空白)の3つから選択）. Possible values include: '御中', '様', '(空白)'.
     */
    @JsonProperty(value = "partner_title")
    private String partnerTitle;

    /**
     * 郵便番号.
     */
    @JsonProperty(value = "partner_zipcode")
    private String partnerZipcode;

    /**
     * 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄.
     */
    @JsonProperty(value = "partner_prefecture_code")
    private Integer partnerPrefectureCode;

    /**
     * 都道府県.
     */
    @JsonProperty(value = "partner_prefecture_name")
    private String partnerPrefectureName;

    /**
     * 市区町村・番地.
     */
    @JsonProperty(value = "partner_address1")
    private String partnerAddress1;

    /**
     * 建物名・部屋番号など.
     */
    @JsonProperty(value = "partner_address2")
    private String partnerAddress2;

    /**
     * 取引先担当者名.
     */
    @JsonProperty(value = "partner_contact_info")
    private String partnerContactInfo;

    /**
     * 事業所名.
     */
    @JsonProperty(value = "company_name", required = true)
    private String companyName;

    /**
     * 郵便番号.
     */
    @JsonProperty(value = "company_zipcode")
    private String companyZipcode;

    /**
     * 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄.
     */
    @JsonProperty(value = "company_prefecture_code")
    private Integer companyPrefectureCode;

    /**
     * 都道府県.
     */
    @JsonProperty(value = "company_prefecture_name")
    private String companyPrefectureName;

    /**
     * 市区町村・番地.
     */
    @JsonProperty(value = "company_address1")
    private String companyAddress1;

    /**
     * 建物名・部屋番号など.
     */
    @JsonProperty(value = "company_address2")
    private String companyAddress2;

    /**
     * 事業所担当者名.
     */
    @JsonProperty(value = "company_contact_info")
    private String companyContactInfo;

    /**
     * 支払方法 (振込: transfer, 引き落とし: direct_debit). Possible values include: '',
     * 'transfer', 'direct_debit'.
     */
    @JsonProperty(value = "payment_type", required = true)
    private String paymentType;

    /**
     * 支払口座.
     */
    @JsonProperty(value = "payment_bank_info")
    private String paymentBankInfo;

    /**
     * メッセージ.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * 備考.
     */
    @JsonProperty(value = "notes")
    private String notes;

    /**
     * レイアウト(default_classic: レイアウト１/クラシック, standard_classic: レイアウト２/クラシック,
     * envelope_classic: 封筒１/クラシック, carried_forward_standard_classic:
     * レイアウト３（繰越金額欄あり）/クラシック, carried_forward_envelope_classic:
     * 封筒２（繰越金額欄あり）/クラシック, default_modern: レイアウト１/モダン, standard_modern:
     * レイアウト２/モダン, envelope_modern: 封筒/モダン). Possible values include:
     * 'default_classic', 'standard_classic', 'envelope_classic',
     * 'carried_forward_standard_classic', 'carried_forward_envelope_classic',
     * 'default_modern', 'standard_modern', 'envelope_modern'.
     */
    @JsonProperty(value = "invoice_layout", required = true)
    private String invoiceLayout;

    /**
     * 請求書の消費税計算方法(inclusive: 内税, exclusive: 外税). Possible values include: '',
     * 'inclusive', 'exclusive'.
     */
    @JsonProperty(value = "tax_entry_method", required = true)
    private String taxEntryMethod;

    /**
     * 取引ID (invoice_statusがissuedの時のみIDが表示されます).
     */
    @JsonProperty(value = "deal_id")
    private Integer dealId;

    /**
     * 請求内容.
     */
    @JsonProperty(value = "invoice_contents")
    private List<InvoiceInvoiceContentsItem> invoiceContents;

    /**
     * The totalAmountPerVatRate property.
     */
    @JsonProperty(value = "total_amount_per_vat_rate", required = true)
    private InvoiceTotalAmountPerVatRate totalAmountPerVatRate;

    /**
     * Get 請求書ID.
     *
     * @return the id value
     */
    public int id() {
        return this.id;
    }

    /**
     * Set 請求書ID.
     *
     * @param id the id value to set
     * @return the Invoice object itself.
     */
    public Invoice withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get 事業所ID.
     *
     * @return the companyId value
     */
    public int companyId() {
        return this.companyId;
    }

    /**
     * Set 事業所ID.
     *
     * @param companyId the companyId value to set
     * @return the Invoice object itself.
     */
    public Invoice withCompanyId(int companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Get 請求日 (yyyy-mm-dd).
     *
     * @return the issueDate value
     */
    public String issueDate() {
        return this.issueDate;
    }

    /**
     * Set 請求日 (yyyy-mm-dd).
     *
     * @param issueDate the issueDate value to set
     * @return the Invoice object itself.
     */
    public Invoice withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * Get 取引先ID.
     *
     * @return the partnerId value
     */
    public Integer partnerId() {
        return this.partnerId;
    }

    /**
     * Set 取引先ID.
     *
     * @param partnerId the partnerId value to set
     * @return the Invoice object itself.
     */
    public Invoice withPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    /**
     * Get 取引先コード.
     *
     * @return the partnerCode value
     */
    public String partnerCode() {
        return this.partnerCode;
    }

    /**
     * Set 取引先コード.
     *
     * @param partnerCode the partnerCode value to set
     * @return the Invoice object itself.
     */
    public Invoice withPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }

    /**
     * Get 請求書番号.
     *
     * @return the invoiceNumber value
     */
    public String invoiceNumber() {
        return this.invoiceNumber;
    }

    /**
     * Set 請求書番号.
     *
     * @param invoiceNumber the invoiceNumber value to set
     * @return the Invoice object itself.
     */
    public Invoice withInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    /**
     * Get タイトル.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set タイトル.
     *
     * @param title the title value to set
     * @return the Invoice object itself.
     */
    public Invoice withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get 期日 (yyyy-mm-dd).
     *
     * @return the dueDate value
     */
    public String dueDate() {
        return this.dueDate;
    }

    /**
     * Set 期日 (yyyy-mm-dd).
     *
     * @param dueDate the dueDate value to set
     * @return the Invoice object itself.
     */
    public Invoice withDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Get 合計金額.
     *
     * @return the totalAmount value
     */
    public int totalAmount() {
        return this.totalAmount;
    }

    /**
     * Set 合計金額.
     *
     * @param totalAmount the totalAmount value to set
     * @return the Invoice object itself.
     */
    public Invoice withTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Get 合計金額.
     *
     * @return the totalVat value
     */
    public Integer totalVat() {
        return this.totalVat;
    }

    /**
     * Set 合計金額.
     *
     * @param totalVat the totalVat value to set
     * @return the Invoice object itself.
     */
    public Invoice withTotalVat(Integer totalVat) {
        this.totalVat = totalVat;
        return this;
    }

    /**
     * Get 小計.
     *
     * @return the subTotal value
     */
    public Integer subTotal() {
        return this.subTotal;
    }

    /**
     * Set 小計.
     *
     * @param subTotal the subTotal value to set
     * @return the Invoice object itself.
     */
    public Invoice withSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
        return this;
    }

    /**
     * Get 売上計上日.
     *
     * @return the bookingDate value
     */
    public String bookingDate() {
        return this.bookingDate;
    }

    /**
     * Set 売上計上日.
     *
     * @param bookingDate the bookingDate value to set
     * @return the Invoice object itself.
     */
    public Invoice withBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
        return this;
    }

    /**
     * Get 概要.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set 概要.
     *
     * @param description the description value to set
     * @return the Invoice object itself.
     */
    public Invoice withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get 請求書ステータス  (draft: 下書き, applying: 申請中, remanded: 差し戻し, rejected: 却下, approved: 承認済み, issued: 発行済み). Possible values include: 'draft', 'applying', 'remanded', 'rejected', 'approved', 'issued'.
     *
     * @return the invoiceStatus value
     */
    public String invoiceStatus() {
        return this.invoiceStatus;
    }

    /**
     * Set 請求書ステータス  (draft: 下書き, applying: 申請中, remanded: 差し戻し, rejected: 却下, approved: 承認済み, issued: 発行済み). Possible values include: 'draft', 'applying', 'remanded', 'rejected', 'approved', 'issued'.
     *
     * @param invoiceStatus the invoiceStatus value to set
     * @return the Invoice object itself.
     */
    public Invoice withInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
        return this;
    }

    /**
     * Get 入金ステータス  (unsettled: 入金待ち, settled: 入金済み). Possible values include: '', 'unsettled', 'settled'.
     *
     * @return the paymentStatus value
     */
    public String paymentStatus() {
        return this.paymentStatus;
    }

    /**
     * Set 入金ステータス  (unsettled: 入金待ち, settled: 入金済み). Possible values include: '', 'unsettled', 'settled'.
     *
     * @param paymentStatus the paymentStatus value to set
     * @return the Invoice object itself.
     */
    public Invoice withPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    /**
     * Get 入金日.
     *
     * @return the paymentDate value
     */
    public String paymentDate() {
        return this.paymentDate;
    }

    /**
     * Set 入金日.
     *
     * @param paymentDate the paymentDate value to set
     * @return the Invoice object itself.
     */
    public Invoice withPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    /**
     * Get web共有日時(最新).
     *
     * @return the webPublishedAt value
     */
    public String webPublishedAt() {
        return this.webPublishedAt;
    }

    /**
     * Set web共有日時(最新).
     *
     * @param webPublishedAt the webPublishedAt value to set
     * @return the Invoice object itself.
     */
    public Invoice withWebPublishedAt(String webPublishedAt) {
        this.webPublishedAt = webPublishedAt;
        return this;
    }

    /**
     * Get web共有ダウンロード日時(最新).
     *
     * @return the webDownloadedAt value
     */
    public String webDownloadedAt() {
        return this.webDownloadedAt;
    }

    /**
     * Set web共有ダウンロード日時(最新).
     *
     * @param webDownloadedAt the webDownloadedAt value to set
     * @return the Invoice object itself.
     */
    public Invoice withWebDownloadedAt(String webDownloadedAt) {
        this.webDownloadedAt = webDownloadedAt;
        return this;
    }

    /**
     * Get web共有取引先確認日時(最新).
     *
     * @return the webConfirmedAt value
     */
    public String webConfirmedAt() {
        return this.webConfirmedAt;
    }

    /**
     * Set web共有取引先確認日時(最新).
     *
     * @param webConfirmedAt the webConfirmedAt value to set
     * @return the Invoice object itself.
     */
    public Invoice withWebConfirmedAt(String webConfirmedAt) {
        this.webConfirmedAt = webConfirmedAt;
        return this;
    }

    /**
     * Get メール送信日時(最新).
     *
     * @return the mailSentAt value
     */
    public String mailSentAt() {
        return this.mailSentAt;
    }

    /**
     * Set メール送信日時(最新).
     *
     * @param mailSentAt the mailSentAt value to set
     * @return the Invoice object itself.
     */
    public Invoice withMailSentAt(String mailSentAt) {
        this.mailSentAt = mailSentAt;
        return this;
    }

    /**
     * Get 郵送ステータス(unrequested: リクエスト前, preview_registered: プレビュー登録, preview_failed: プレビュー登録失敗, ordered: 注文中, order_failed: 注文失敗, printing: 印刷中, canceled: キャンセル, posted: 投函済み). Possible values include: '', 'unrequested', 'preview_registered', 'preview_failed', 'ordered', 'order_failed', 'printing', 'canceled', 'posted'.
     *
     * @return the postingStatus value
     */
    public String postingStatus() {
        return this.postingStatus;
    }

    /**
     * Set 郵送ステータス(unrequested: リクエスト前, preview_registered: プレビュー登録, preview_failed: プレビュー登録失敗, ordered: 注文中, order_failed: 注文失敗, printing: 印刷中, canceled: キャンセル, posted: 投函済み). Possible values include: '', 'unrequested', 'preview_registered', 'preview_failed', 'ordered', 'order_failed', 'printing', 'canceled', 'posted'.
     *
     * @param postingStatus the postingStatus value to set
     * @return the Invoice object itself.
     */
    public Invoice withPostingStatus(String postingStatus) {
        this.postingStatus = postingStatus;
        return this;
    }

    /**
     * Get 取引先名.
     *
     * @return the partnerName value
     */
    public String partnerName() {
        return this.partnerName;
    }

    /**
     * Set 取引先名.
     *
     * @param partnerName the partnerName value to set
     * @return the Invoice object itself.
     */
    public Invoice withPartnerName(String partnerName) {
        this.partnerName = partnerName;
        return this;
    }

    /**
     * Get 取引先正式名称.
     *
     * @return the partnerLongName value
     */
    public String partnerLongName() {
        return this.partnerLongName;
    }

    /**
     * Set 取引先正式名称.
     *
     * @param partnerLongName the partnerLongName value to set
     * @return the Invoice object itself.
     */
    public Invoice withPartnerLongName(String partnerLongName) {
        this.partnerLongName = partnerLongName;
        return this;
    }

    /**
     * Get 敬称（御中、様、(空白)の3つから選択）. Possible values include: '御中', '様', '(空白)'.
     *
     * @return the partnerTitle value
     */
    public String partnerTitle() {
        return this.partnerTitle;
    }

    /**
     * Set 敬称（御中、様、(空白)の3つから選択）. Possible values include: '御中', '様', '(空白)'.
     *
     * @param partnerTitle the partnerTitle value to set
     * @return the Invoice object itself.
     */
    public Invoice withPartnerTitle(String partnerTitle) {
        this.partnerTitle = partnerTitle;
        return this;
    }

    /**
     * Get 郵便番号.
     *
     * @return the partnerZipcode value
     */
    public String partnerZipcode() {
        return this.partnerZipcode;
    }

    /**
     * Set 郵便番号.
     *
     * @param partnerZipcode the partnerZipcode value to set
     * @return the Invoice object itself.
     */
    public Invoice withPartnerZipcode(String partnerZipcode) {
        this.partnerZipcode = partnerZipcode;
        return this;
    }

    /**
     * Get 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄.
     *
     * @return the partnerPrefectureCode value
     */
    public Integer partnerPrefectureCode() {
        return this.partnerPrefectureCode;
    }

    /**
     * Set 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄.
     *
     * @param partnerPrefectureCode the partnerPrefectureCode value to set
     * @return the Invoice object itself.
     */
    public Invoice withPartnerPrefectureCode(Integer partnerPrefectureCode) {
        this.partnerPrefectureCode = partnerPrefectureCode;
        return this;
    }

    /**
     * Get 都道府県.
     *
     * @return the partnerPrefectureName value
     */
    public String partnerPrefectureName() {
        return this.partnerPrefectureName;
    }

    /**
     * Set 都道府県.
     *
     * @param partnerPrefectureName the partnerPrefectureName value to set
     * @return the Invoice object itself.
     */
    public Invoice withPartnerPrefectureName(String partnerPrefectureName) {
        this.partnerPrefectureName = partnerPrefectureName;
        return this;
    }

    /**
     * Get 市区町村・番地.
     *
     * @return the partnerAddress1 value
     */
    public String partnerAddress1() {
        return this.partnerAddress1;
    }

    /**
     * Set 市区町村・番地.
     *
     * @param partnerAddress1 the partnerAddress1 value to set
     * @return the Invoice object itself.
     */
    public Invoice withPartnerAddress1(String partnerAddress1) {
        this.partnerAddress1 = partnerAddress1;
        return this;
    }

    /**
     * Get 建物名・部屋番号など.
     *
     * @return the partnerAddress2 value
     */
    public String partnerAddress2() {
        return this.partnerAddress2;
    }

    /**
     * Set 建物名・部屋番号など.
     *
     * @param partnerAddress2 the partnerAddress2 value to set
     * @return the Invoice object itself.
     */
    public Invoice withPartnerAddress2(String partnerAddress2) {
        this.partnerAddress2 = partnerAddress2;
        return this;
    }

    /**
     * Get 取引先担当者名.
     *
     * @return the partnerContactInfo value
     */
    public String partnerContactInfo() {
        return this.partnerContactInfo;
    }

    /**
     * Set 取引先担当者名.
     *
     * @param partnerContactInfo the partnerContactInfo value to set
     * @return the Invoice object itself.
     */
    public Invoice withPartnerContactInfo(String partnerContactInfo) {
        this.partnerContactInfo = partnerContactInfo;
        return this;
    }

    /**
     * Get 事業所名.
     *
     * @return the companyName value
     */
    public String companyName() {
        return this.companyName;
    }

    /**
     * Set 事業所名.
     *
     * @param companyName the companyName value to set
     * @return the Invoice object itself.
     */
    public Invoice withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Get 郵便番号.
     *
     * @return the companyZipcode value
     */
    public String companyZipcode() {
        return this.companyZipcode;
    }

    /**
     * Set 郵便番号.
     *
     * @param companyZipcode the companyZipcode value to set
     * @return the Invoice object itself.
     */
    public Invoice withCompanyZipcode(String companyZipcode) {
        this.companyZipcode = companyZipcode;
        return this;
    }

    /**
     * Get 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄.
     *
     * @return the companyPrefectureCode value
     */
    public Integer companyPrefectureCode() {
        return this.companyPrefectureCode;
    }

    /**
     * Set 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄.
     *
     * @param companyPrefectureCode the companyPrefectureCode value to set
     * @return the Invoice object itself.
     */
    public Invoice withCompanyPrefectureCode(Integer companyPrefectureCode) {
        this.companyPrefectureCode = companyPrefectureCode;
        return this;
    }

    /**
     * Get 都道府県.
     *
     * @return the companyPrefectureName value
     */
    public String companyPrefectureName() {
        return this.companyPrefectureName;
    }

    /**
     * Set 都道府県.
     *
     * @param companyPrefectureName the companyPrefectureName value to set
     * @return the Invoice object itself.
     */
    public Invoice withCompanyPrefectureName(String companyPrefectureName) {
        this.companyPrefectureName = companyPrefectureName;
        return this;
    }

    /**
     * Get 市区町村・番地.
     *
     * @return the companyAddress1 value
     */
    public String companyAddress1() {
        return this.companyAddress1;
    }

    /**
     * Set 市区町村・番地.
     *
     * @param companyAddress1 the companyAddress1 value to set
     * @return the Invoice object itself.
     */
    public Invoice withCompanyAddress1(String companyAddress1) {
        this.companyAddress1 = companyAddress1;
        return this;
    }

    /**
     * Get 建物名・部屋番号など.
     *
     * @return the companyAddress2 value
     */
    public String companyAddress2() {
        return this.companyAddress2;
    }

    /**
     * Set 建物名・部屋番号など.
     *
     * @param companyAddress2 the companyAddress2 value to set
     * @return the Invoice object itself.
     */
    public Invoice withCompanyAddress2(String companyAddress2) {
        this.companyAddress2 = companyAddress2;
        return this;
    }

    /**
     * Get 事業所担当者名.
     *
     * @return the companyContactInfo value
     */
    public String companyContactInfo() {
        return this.companyContactInfo;
    }

    /**
     * Set 事業所担当者名.
     *
     * @param companyContactInfo the companyContactInfo value to set
     * @return the Invoice object itself.
     */
    public Invoice withCompanyContactInfo(String companyContactInfo) {
        this.companyContactInfo = companyContactInfo;
        return this;
    }

    /**
     * Get 支払方法 (振込: transfer, 引き落とし: direct_debit). Possible values include: '', 'transfer', 'direct_debit'.
     *
     * @return the paymentType value
     */
    public String paymentType() {
        return this.paymentType;
    }

    /**
     * Set 支払方法 (振込: transfer, 引き落とし: direct_debit). Possible values include: '', 'transfer', 'direct_debit'.
     *
     * @param paymentType the paymentType value to set
     * @return the Invoice object itself.
     */
    public Invoice withPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    /**
     * Get 支払口座.
     *
     * @return the paymentBankInfo value
     */
    public String paymentBankInfo() {
        return this.paymentBankInfo;
    }

    /**
     * Set 支払口座.
     *
     * @param paymentBankInfo the paymentBankInfo value to set
     * @return the Invoice object itself.
     */
    public Invoice withPaymentBankInfo(String paymentBankInfo) {
        this.paymentBankInfo = paymentBankInfo;
        return this;
    }

    /**
     * Get メッセージ.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set メッセージ.
     *
     * @param message the message value to set
     * @return the Invoice object itself.
     */
    public Invoice withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get 備考.
     *
     * @return the notes value
     */
    public String notes() {
        return this.notes;
    }

    /**
     * Set 備考.
     *
     * @param notes the notes value to set
     * @return the Invoice object itself.
     */
    public Invoice withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Get レイアウト(default_classic: レイアウト１/クラシック, standard_classic: レイアウト２/クラシック, envelope_classic: 封筒１/クラシック, carried_forward_standard_classic: レイアウト３（繰越金額欄あり）/クラシック, carried_forward_envelope_classic: 封筒２（繰越金額欄あり）/クラシック, default_modern: レイアウト１/モダン, standard_modern: レイアウト２/モダン, envelope_modern: 封筒/モダン). Possible values include: 'default_classic', 'standard_classic', 'envelope_classic', 'carried_forward_standard_classic', 'carried_forward_envelope_classic', 'default_modern', 'standard_modern', 'envelope_modern'.
     *
     * @return the invoiceLayout value
     */
    public String invoiceLayout() {
        return this.invoiceLayout;
    }

    /**
     * Set レイアウト(default_classic: レイアウト１/クラシック, standard_classic: レイアウト２/クラシック, envelope_classic: 封筒１/クラシック, carried_forward_standard_classic: レイアウト３（繰越金額欄あり）/クラシック, carried_forward_envelope_classic: 封筒２（繰越金額欄あり）/クラシック, default_modern: レイアウト１/モダン, standard_modern: レイアウト２/モダン, envelope_modern: 封筒/モダン). Possible values include: 'default_classic', 'standard_classic', 'envelope_classic', 'carried_forward_standard_classic', 'carried_forward_envelope_classic', 'default_modern', 'standard_modern', 'envelope_modern'.
     *
     * @param invoiceLayout the invoiceLayout value to set
     * @return the Invoice object itself.
     */
    public Invoice withInvoiceLayout(String invoiceLayout) {
        this.invoiceLayout = invoiceLayout;
        return this;
    }

    /**
     * Get 請求書の消費税計算方法(inclusive: 内税, exclusive: 外税). Possible values include: '', 'inclusive', 'exclusive'.
     *
     * @return the taxEntryMethod value
     */
    public String taxEntryMethod() {
        return this.taxEntryMethod;
    }

    /**
     * Set 請求書の消費税計算方法(inclusive: 内税, exclusive: 外税). Possible values include: '', 'inclusive', 'exclusive'.
     *
     * @param taxEntryMethod the taxEntryMethod value to set
     * @return the Invoice object itself.
     */
    public Invoice withTaxEntryMethod(String taxEntryMethod) {
        this.taxEntryMethod = taxEntryMethod;
        return this;
    }

    /**
     * Get 取引ID (invoice_statusがissuedの時のみIDが表示されます).
     *
     * @return the dealId value
     */
    public Integer dealId() {
        return this.dealId;
    }

    /**
     * Set 取引ID (invoice_statusがissuedの時のみIDが表示されます).
     *
     * @param dealId the dealId value to set
     * @return the Invoice object itself.
     */
    public Invoice withDealId(Integer dealId) {
        this.dealId = dealId;
        return this;
    }

    /**
     * Get 請求内容.
     *
     * @return the invoiceContents value
     */
    public List<InvoiceInvoiceContentsItem> invoiceContents() {
        return this.invoiceContents;
    }

    /**
     * Set 請求内容.
     *
     * @param invoiceContents the invoiceContents value to set
     * @return the Invoice object itself.
     */
    public Invoice withInvoiceContents(List<InvoiceInvoiceContentsItem> invoiceContents) {
        this.invoiceContents = invoiceContents;
        return this;
    }

    /**
     * Get the totalAmountPerVatRate value.
     *
     * @return the totalAmountPerVatRate value
     */
    public InvoiceTotalAmountPerVatRate totalAmountPerVatRate() {
        return this.totalAmountPerVatRate;
    }

    /**
     * Set the totalAmountPerVatRate value.
     *
     * @param totalAmountPerVatRate the totalAmountPerVatRate value to set
     * @return the Invoice object itself.
     */
    public Invoice withTotalAmountPerVatRate(InvoiceTotalAmountPerVatRate totalAmountPerVatRate) {
        this.totalAmountPerVatRate = totalAmountPerVatRate;
        return this;
    }

}