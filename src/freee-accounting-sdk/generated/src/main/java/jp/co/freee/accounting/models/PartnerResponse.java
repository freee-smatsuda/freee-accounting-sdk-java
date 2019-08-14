/**
 * Copyright (c) freee K.K. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package jp.co.freee.accounting.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PartnerResponse model.
 */
public class PartnerResponse {
    /**
     * 取引先ID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /**
     * 取引先コード.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /**
     * 事業所ID.
     */
    @JsonProperty(value = "company_id", required = true)
    private int companyId;

    /**
     * 取引先名.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * ショートカット1 (20文字以内).
     */
    @JsonProperty(value = "shortcut1")
    private String shortcut1;

    /**
     * ショートカット2 (20文字以内).
     */
    @JsonProperty(value = "shortcut2")
    private String shortcut2;

    /**
     * 正式名称（255文字以内）.
     */
    @JsonProperty(value = "long_name")
    private String longName;

    /**
     * カナ名称（255文字以内）.
     */
    @JsonProperty(value = "name_kana")
    private String nameKana;

    /**
     * 敬称（御中、様、(空白)の3つから選択）. Possible values include: '御中', '様', '(空白)'.
     */
    @JsonProperty(value = "default_title")
    private String defaultTitle;

    /**
     * 電話番号.
     */
    @JsonProperty(value = "phone")
    private String phone;

    /**
     * 営業担当者名.
     */
    @JsonProperty(value = "contact_name")
    private String contactName;

    /**
     * 営業担当者 メールアドレス.
     */
    @JsonProperty(value = "email")
    private String email;

    /**
     * 郵便番号.
     */
    @JsonProperty(value = "address_attributes[zipcode]")
    private String addressAttributeszipcode;

    /**
     * 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄.
     */
    @JsonProperty(value = "address_attributes[prefecture_code]")
    private Integer addressAttributesprefectureCode;

    /**
     * 市区町村・番地.
     */
    @JsonProperty(value = "address_attributes[street_name1]")
    private String addressAttributesstreetName1;

    /**
     * 建物名・部屋番号など.
     */
    @JsonProperty(value = "address_attributes[street_name2]")
    private String addressAttributesstreetName2;

    /**
     * 請求書送付方法(mail:メール、posting:郵送、mail_and_posting:メールと郵送). Possible values
     * include: 'mail', 'posting', 'main_and_posting', ''.
     */
    @JsonProperty(value = "partner_doc_setting_attributes[sending_method]")
    private String partnerDocSettingAttributessendingMethod;

    /**
     * 銀行名.
     */
    @JsonProperty(value = "partner_bank_account_attributes[bank_name]")
    private String partnerBankAccountAttributesbankName;

    /**
     * 銀行名（カナ）.
     */
    @JsonProperty(value = "partner_bank_account_attributes[bank_name_kana]")
    private String partnerBankAccountAttributesbankNameKana;

    /**
     * 銀行番号.
     */
    @JsonProperty(value = "partner_bank_account_attributes[bank_code]")
    private String partnerBankAccountAttributesbankCode;

    /**
     * 支店名.
     */
    @JsonProperty(value = "partner_bank_account_attributes[branch_name]")
    private String partnerBankAccountAttributesbranchName;

    /**
     * 支店名（カナ）.
     */
    @JsonProperty(value = "partner_bank_account_attributes[branch_kana]")
    private String partnerBankAccountAttributesbranchKana;

    /**
     * 受取人名（カナ）.
     */
    @JsonProperty(value = "partner_bank_account_attributes[branch_code]")
    private String partnerBankAccountAttributesbranchCode;

    /**
     * 口座種別(ordinary:普通、checking:当座、earmarked:納税準備預金、savings:貯蓄、other:その他).
     * Possible values include: 'ordinary', 'checking', 'earmarked', 'savings',
     * 'other', ''.
     */
    @JsonProperty(value = "partner_bank_account_attributes[account_type]")
    private String partnerBankAccountAttributesaccountType;

    /**
     * 口座番号.
     */
    @JsonProperty(value = "partner_bank_account_attributes[account_number]")
    private String partnerBankAccountAttributesaccountNumber;

    /**
     * 受取人名（カナ）.
     */
    @JsonProperty(value = "partner_bank_account_attributes[account_name]")
    private String partnerBankAccountAttributesaccountName;

    /**
     * 受取人名.
     */
    @JsonProperty(value = "partner_bank_account_attributes[long_account_name]")
    private String partnerBankAccountAttributeslongAccountName;

    /**
     * Get 取引先ID.
     *
     * @return the id value
     */
    public int id() {
        return this.id;
    }

    /**
     * Set 取引先ID.
     *
     * @param id the id value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get 取引先コード.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set 取引先コード.
     *
     * @param code the code value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withCode(String code) {
        this.code = code;
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
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withCompanyId(int companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Get 取引先名.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 取引先名.
     *
     * @param name the name value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get ショートカット1 (20文字以内).
     *
     * @return the shortcut1 value
     */
    public String shortcut1() {
        return this.shortcut1;
    }

    /**
     * Set ショートカット1 (20文字以内).
     *
     * @param shortcut1 the shortcut1 value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withShortcut1(String shortcut1) {
        this.shortcut1 = shortcut1;
        return this;
    }

    /**
     * Get ショートカット2 (20文字以内).
     *
     * @return the shortcut2 value
     */
    public String shortcut2() {
        return this.shortcut2;
    }

    /**
     * Set ショートカット2 (20文字以内).
     *
     * @param shortcut2 the shortcut2 value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withShortcut2(String shortcut2) {
        this.shortcut2 = shortcut2;
        return this;
    }

    /**
     * Get 正式名称（255文字以内）.
     *
     * @return the longName value
     */
    public String longName() {
        return this.longName;
    }

    /**
     * Set 正式名称（255文字以内）.
     *
     * @param longName the longName value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withLongName(String longName) {
        this.longName = longName;
        return this;
    }

    /**
     * Get カナ名称（255文字以内）.
     *
     * @return the nameKana value
     */
    public String nameKana() {
        return this.nameKana;
    }

    /**
     * Set カナ名称（255文字以内）.
     *
     * @param nameKana the nameKana value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withNameKana(String nameKana) {
        this.nameKana = nameKana;
        return this;
    }

    /**
     * Get 敬称（御中、様、(空白)の3つから選択）. Possible values include: '御中', '様', '(空白)'.
     *
     * @return the defaultTitle value
     */
    public String defaultTitle() {
        return this.defaultTitle;
    }

    /**
     * Set 敬称（御中、様、(空白)の3つから選択）. Possible values include: '御中', '様', '(空白)'.
     *
     * @param defaultTitle the defaultTitle value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withDefaultTitle(String defaultTitle) {
        this.defaultTitle = defaultTitle;
        return this;
    }

    /**
     * Get 電話番号.
     *
     * @return the phone value
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set 電話番号.
     *
     * @param phone the phone value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get 営業担当者名.
     *
     * @return the contactName value
     */
    public String contactName() {
        return this.contactName;
    }

    /**
     * Set 営業担当者名.
     *
     * @param contactName the contactName value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    /**
     * Get 営業担当者 メールアドレス.
     *
     * @return the email value
     */
    public String email() {
        return this.email;
    }

    /**
     * Set 営業担当者 メールアドレス.
     *
     * @param email the email value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get 郵便番号.
     *
     * @return the addressAttributeszipcode value
     */
    public String addressAttributeszipcode() {
        return this.addressAttributeszipcode;
    }

    /**
     * Set 郵便番号.
     *
     * @param addressAttributeszipcode the addressAttributeszipcode value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withAddressAttributeszipcode(String addressAttributeszipcode) {
        this.addressAttributeszipcode = addressAttributeszipcode;
        return this;
    }

    /**
     * Get 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄.
     *
     * @return the addressAttributesprefectureCode value
     */
    public Integer addressAttributesprefectureCode() {
        return this.addressAttributesprefectureCode;
    }

    /**
     * Set 都道府県コード（0:北海道、1:青森、2:岩手、3:宮城、4:秋田、5:山形、6:福島、7:茨城、8:栃木、9:群馬、10:埼玉、11:千葉、12:東京、13:神奈川、14:新潟、15:富山、16:石川、17:福井、18:山梨、19:長野、20:岐阜、21:静岡、22:愛知、23:三重、24:滋賀、25:京都、26:大阪、27:兵庫、28:奈良、29:和歌山、30:鳥取、31:島根、32:岡山、33:広島、34:山口、35:徳島、36:香川、37:愛媛、38:高知、39:福岡、40:佐賀、41:長崎、42:熊本、43:大分、44:宮崎、45:鹿児島、46:沖縄.
     *
     * @param addressAttributesprefectureCode the addressAttributesprefectureCode value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withAddressAttributesprefectureCode(Integer addressAttributesprefectureCode) {
        this.addressAttributesprefectureCode = addressAttributesprefectureCode;
        return this;
    }

    /**
     * Get 市区町村・番地.
     *
     * @return the addressAttributesstreetName1 value
     */
    public String addressAttributesstreetName1() {
        return this.addressAttributesstreetName1;
    }

    /**
     * Set 市区町村・番地.
     *
     * @param addressAttributesstreetName1 the addressAttributesstreetName1 value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withAddressAttributesstreetName1(String addressAttributesstreetName1) {
        this.addressAttributesstreetName1 = addressAttributesstreetName1;
        return this;
    }

    /**
     * Get 建物名・部屋番号など.
     *
     * @return the addressAttributesstreetName2 value
     */
    public String addressAttributesstreetName2() {
        return this.addressAttributesstreetName2;
    }

    /**
     * Set 建物名・部屋番号など.
     *
     * @param addressAttributesstreetName2 the addressAttributesstreetName2 value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withAddressAttributesstreetName2(String addressAttributesstreetName2) {
        this.addressAttributesstreetName2 = addressAttributesstreetName2;
        return this;
    }

    /**
     * Get 請求書送付方法(mail:メール、posting:郵送、mail_and_posting:メールと郵送). Possible values include: 'mail', 'posting', 'main_and_posting', ''.
     *
     * @return the partnerDocSettingAttributessendingMethod value
     */
    public String partnerDocSettingAttributessendingMethod() {
        return this.partnerDocSettingAttributessendingMethod;
    }

    /**
     * Set 請求書送付方法(mail:メール、posting:郵送、mail_and_posting:メールと郵送). Possible values include: 'mail', 'posting', 'main_and_posting', ''.
     *
     * @param partnerDocSettingAttributessendingMethod the partnerDocSettingAttributessendingMethod value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withPartnerDocSettingAttributessendingMethod(String partnerDocSettingAttributessendingMethod) {
        this.partnerDocSettingAttributessendingMethod = partnerDocSettingAttributessendingMethod;
        return this;
    }

    /**
     * Get 銀行名.
     *
     * @return the partnerBankAccountAttributesbankName value
     */
    public String partnerBankAccountAttributesbankName() {
        return this.partnerBankAccountAttributesbankName;
    }

    /**
     * Set 銀行名.
     *
     * @param partnerBankAccountAttributesbankName the partnerBankAccountAttributesbankName value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withPartnerBankAccountAttributesbankName(String partnerBankAccountAttributesbankName) {
        this.partnerBankAccountAttributesbankName = partnerBankAccountAttributesbankName;
        return this;
    }

    /**
     * Get 銀行名（カナ）.
     *
     * @return the partnerBankAccountAttributesbankNameKana value
     */
    public String partnerBankAccountAttributesbankNameKana() {
        return this.partnerBankAccountAttributesbankNameKana;
    }

    /**
     * Set 銀行名（カナ）.
     *
     * @param partnerBankAccountAttributesbankNameKana the partnerBankAccountAttributesbankNameKana value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withPartnerBankAccountAttributesbankNameKana(String partnerBankAccountAttributesbankNameKana) {
        this.partnerBankAccountAttributesbankNameKana = partnerBankAccountAttributesbankNameKana;
        return this;
    }

    /**
     * Get 銀行番号.
     *
     * @return the partnerBankAccountAttributesbankCode value
     */
    public String partnerBankAccountAttributesbankCode() {
        return this.partnerBankAccountAttributesbankCode;
    }

    /**
     * Set 銀行番号.
     *
     * @param partnerBankAccountAttributesbankCode the partnerBankAccountAttributesbankCode value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withPartnerBankAccountAttributesbankCode(String partnerBankAccountAttributesbankCode) {
        this.partnerBankAccountAttributesbankCode = partnerBankAccountAttributesbankCode;
        return this;
    }

    /**
     * Get 支店名.
     *
     * @return the partnerBankAccountAttributesbranchName value
     */
    public String partnerBankAccountAttributesbranchName() {
        return this.partnerBankAccountAttributesbranchName;
    }

    /**
     * Set 支店名.
     *
     * @param partnerBankAccountAttributesbranchName the partnerBankAccountAttributesbranchName value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withPartnerBankAccountAttributesbranchName(String partnerBankAccountAttributesbranchName) {
        this.partnerBankAccountAttributesbranchName = partnerBankAccountAttributesbranchName;
        return this;
    }

    /**
     * Get 支店名（カナ）.
     *
     * @return the partnerBankAccountAttributesbranchKana value
     */
    public String partnerBankAccountAttributesbranchKana() {
        return this.partnerBankAccountAttributesbranchKana;
    }

    /**
     * Set 支店名（カナ）.
     *
     * @param partnerBankAccountAttributesbranchKana the partnerBankAccountAttributesbranchKana value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withPartnerBankAccountAttributesbranchKana(String partnerBankAccountAttributesbranchKana) {
        this.partnerBankAccountAttributesbranchKana = partnerBankAccountAttributesbranchKana;
        return this;
    }

    /**
     * Get 受取人名（カナ）.
     *
     * @return the partnerBankAccountAttributesbranchCode value
     */
    public String partnerBankAccountAttributesbranchCode() {
        return this.partnerBankAccountAttributesbranchCode;
    }

    /**
     * Set 受取人名（カナ）.
     *
     * @param partnerBankAccountAttributesbranchCode the partnerBankAccountAttributesbranchCode value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withPartnerBankAccountAttributesbranchCode(String partnerBankAccountAttributesbranchCode) {
        this.partnerBankAccountAttributesbranchCode = partnerBankAccountAttributesbranchCode;
        return this;
    }

    /**
     * Get 口座種別(ordinary:普通、checking:当座、earmarked:納税準備預金、savings:貯蓄、other:その他). Possible values include: 'ordinary', 'checking', 'earmarked', 'savings', 'other', ''.
     *
     * @return the partnerBankAccountAttributesaccountType value
     */
    public String partnerBankAccountAttributesaccountType() {
        return this.partnerBankAccountAttributesaccountType;
    }

    /**
     * Set 口座種別(ordinary:普通、checking:当座、earmarked:納税準備預金、savings:貯蓄、other:その他). Possible values include: 'ordinary', 'checking', 'earmarked', 'savings', 'other', ''.
     *
     * @param partnerBankAccountAttributesaccountType the partnerBankAccountAttributesaccountType value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withPartnerBankAccountAttributesaccountType(String partnerBankAccountAttributesaccountType) {
        this.partnerBankAccountAttributesaccountType = partnerBankAccountAttributesaccountType;
        return this;
    }

    /**
     * Get 口座番号.
     *
     * @return the partnerBankAccountAttributesaccountNumber value
     */
    public String partnerBankAccountAttributesaccountNumber() {
        return this.partnerBankAccountAttributesaccountNumber;
    }

    /**
     * Set 口座番号.
     *
     * @param partnerBankAccountAttributesaccountNumber the partnerBankAccountAttributesaccountNumber value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withPartnerBankAccountAttributesaccountNumber(String partnerBankAccountAttributesaccountNumber) {
        this.partnerBankAccountAttributesaccountNumber = partnerBankAccountAttributesaccountNumber;
        return this;
    }

    /**
     * Get 受取人名（カナ）.
     *
     * @return the partnerBankAccountAttributesaccountName value
     */
    public String partnerBankAccountAttributesaccountName() {
        return this.partnerBankAccountAttributesaccountName;
    }

    /**
     * Set 受取人名（カナ）.
     *
     * @param partnerBankAccountAttributesaccountName the partnerBankAccountAttributesaccountName value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withPartnerBankAccountAttributesaccountName(String partnerBankAccountAttributesaccountName) {
        this.partnerBankAccountAttributesaccountName = partnerBankAccountAttributesaccountName;
        return this;
    }

    /**
     * Get 受取人名.
     *
     * @return the partnerBankAccountAttributeslongAccountName value
     */
    public String partnerBankAccountAttributeslongAccountName() {
        return this.partnerBankAccountAttributeslongAccountName;
    }

    /**
     * Set 受取人名.
     *
     * @param partnerBankAccountAttributeslongAccountName the partnerBankAccountAttributeslongAccountName value to set
     * @return the PartnerResponse object itself.
     */
    public PartnerResponse withPartnerBankAccountAttributeslongAccountName(String partnerBankAccountAttributeslongAccountName) {
        this.partnerBankAccountAttributeslongAccountName = partnerBankAccountAttributeslongAccountName;
        return this;
    }

}