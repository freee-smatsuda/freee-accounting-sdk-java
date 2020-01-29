

# Invoice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 請求書ID | 
**companyId** | **Integer** | 事業所ID | 
**issueDate** | **String** | 請求日 (yyyy-mm-dd) | 
**partnerId** | **Integer** | 取引先ID | 
**partnerCode** | **String** | 取引先コード |  [optional]
**invoiceNumber** | **String** | 請求書番号 | 
**title** | **String** | タイトル |  [optional]
**dueDate** | **String** | 期日 (yyyy-mm-dd) |  [optional]
**totalAmount** | **Integer** | 合計金額 | 
**totalVat** | **Integer** | 合計金額 |  [optional]
**subTotal** | **Integer** | 小計 |  [optional]
**bookingDate** | **String** | 売上計上日 |  [optional]
**description** | **String** | 概要 |  [optional]
**invoiceStatus** | [**InvoiceStatusEnum**](#InvoiceStatusEnum) | 請求書ステータス  (draft: 下書き, applying: 申請中, remanded: 差し戻し, rejected: 却下, approved: 承認済み, issued: 発行済み) | 
**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | 入金ステータス  (unsettled: 入金待ち, settled: 入金済み) |  [optional]
**paymentDate** | **String** | 入金日 |  [optional]
**webPublishedAt** | **String** | Web共有日時(最新) |  [optional]
**webDownloadedAt** | **String** | Web共有ダウンロード日時(最新) |  [optional]
**webConfirmedAt** | **String** | Web共有取引先確認日時(最新) |  [optional]
**mailSentAt** | **String** | メール送信日時(最新) |  [optional]
**postingStatus** | [**PostingStatusEnum**](#PostingStatusEnum) | 郵送ステータス(unrequested: リクエスト前, preview_registered: プレビュー登録, preview_failed: プレビュー登録失敗, ordered: 注文中, order_failed: 注文失敗, printing: 印刷中, canceled: キャンセル, posted: 投函済み) | 
**partnerName** | **String** | 取引先名 |  [optional]
**partnerLongName** | **String** | 取引先正式名称 |  [optional]
**partnerTitle** | **String** | 敬称（御中、様、(空白)の3つから選択） |  [optional]
**partnerZipcode** | **String** | 郵便番号 |  [optional]
**partnerPrefectureCode** | **Integer** | 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄 |  [optional]
**partnerPrefectureName** | **String** | 都道府県 |  [optional]
**partnerAddress1** | **String** | 市区町村・番地 |  [optional]
**partnerAddress2** | **String** | 建物名・部屋番号など |  [optional]
**partnerContactInfo** | **String** | 取引先担当者名 |  [optional]
**companyName** | **String** | 事業所名 | 
**companyZipcode** | **String** | 郵便番号 |  [optional]
**companyPrefectureCode** | **Integer** | 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄 |  [optional]
**companyPrefectureName** | **String** | 都道府県 |  [optional]
**companyAddress1** | **String** | 市区町村・番地 |  [optional]
**companyAddress2** | **String** | 建物名・部屋番号など |  [optional]
**companyContactInfo** | **String** | 事業所担当者名 |  [optional]
**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | 支払方法 (振込: transfer, 引き落とし: direct_debit) | 
**paymentBankInfo** | **String** | 支払口座 |  [optional]
**message** | **String** | メッセージ |  [optional]
**notes** | **String** | 備考 |  [optional]
**invoiceLayout** | [**InvoiceLayoutEnum**](#InvoiceLayoutEnum) | レイアウト(default_classic: レイアウト１/クラシック, standard_classic: レイアウト２/クラシック, envelope_classic: 封筒１/クラシック, carried_forward_standard_classic: レイアウト３（繰越金額欄あり）/クラシック, carried_forward_envelope_classic: 封筒２（繰越金額欄あり）/クラシック, default_modern: レイアウト１/モダン, standard_modern: レイアウト２/モダン, envelope_modern: 封筒/モダン) | 
**taxEntryMethod** | [**TaxEntryMethodEnum**](#TaxEntryMethodEnum) | 請求書の消費税計算方法(inclusive: 内税, exclusive: 外税) | 
**dealId** | **Integer** | 取引ID (invoice_statusがissuedの時のみIDが表示されます) |  [optional]
**invoiceContents** | [**List&lt;InvoiceInvoiceContents&gt;**](InvoiceInvoiceContents.md) | 請求内容 |  [optional]
**totalAmountPerVatRate** | [**InvoiceTotalAmountPerVatRate**](InvoiceTotalAmountPerVatRate.md) |  | 



## Enum: InvoiceStatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
APPLYING | &quot;applying&quot;
REMANDED | &quot;remanded&quot;
REJECTED | &quot;rejected&quot;
APPROVED | &quot;approved&quot;
ISSUED | &quot;issued&quot;



## Enum: PaymentStatusEnum

Name | Value
---- | -----
EMPTY | &quot;&quot;
UNSETTLED | &quot;unsettled&quot;
SETTLED | &quot;settled&quot;



## Enum: PostingStatusEnum

Name | Value
---- | -----
EMPTY | &quot;&quot;
UNREQUESTED | &quot;unrequested&quot;
PREVIEW_REGISTERED | &quot;preview_registered&quot;
PREVIEW_FAILED | &quot;preview_failed&quot;
ORDERED | &quot;ordered&quot;
ORDER_FAILED | &quot;order_failed&quot;
PRINTING | &quot;printing&quot;
CANCELED | &quot;canceled&quot;
POSTED | &quot;posted&quot;



## Enum: PaymentTypeEnum

Name | Value
---- | -----
EMPTY | &quot;&quot;
TRANSFER | &quot;transfer&quot;
DIRECT_DEBIT | &quot;direct_debit&quot;



## Enum: InvoiceLayoutEnum

Name | Value
---- | -----
DEFAULT_CLASSIC | &quot;default_classic&quot;
STANDARD_CLASSIC | &quot;standard_classic&quot;
ENVELOPE_CLASSIC | &quot;envelope_classic&quot;
CARRIED_FORWARD_STANDARD_CLASSIC | &quot;carried_forward_standard_classic&quot;
CARRIED_FORWARD_ENVELOPE_CLASSIC | &quot;carried_forward_envelope_classic&quot;
DEFAULT_MODERN | &quot;default_modern&quot;
STANDARD_MODERN | &quot;standard_modern&quot;
ENVELOPE_MODERN | &quot;envelope_modern&quot;



## Enum: TaxEntryMethodEnum

Name | Value
---- | -----
EMPTY | &quot;&quot;
INCLUSIVE | &quot;inclusive&quot;
EXCLUSIVE | &quot;exclusive&quot;


