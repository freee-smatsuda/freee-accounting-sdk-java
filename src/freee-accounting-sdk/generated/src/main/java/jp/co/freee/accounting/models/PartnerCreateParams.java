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
 * The PartnerCreateParams model.
 */
public class PartnerCreateParams {
    /**
     * 事業所ID.
     */
    @JsonProperty(value = "company_id", required = true)
    private int companyId;

    /**
     * 取引先名 (255文字以内).
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * 取引先コード.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * ショートカット１ (255文字以内).
     */
    @JsonProperty(value = "shortcut1")
    private String shortcut1;

    /**
     * ショートカット２ (255文字以内).
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
     * 敬称（御中、様、(空白)の3つから選択）. Possible values include: '', '(空白)', '御中', '様'.
     */
    @JsonProperty(value = "default_title")
    private String defaultTitle;

    /**
     * 電話番号.
     */
    @JsonProperty(value = "phone")
    private String phone;

    /**
     * 営業担当者名 (255文字以内).
     */
    @JsonProperty(value = "contact_name")
    private String contactName;

    /**
     * 営業担当者 メールアドレス (255文字以内).
     */
    @JsonProperty(value = "email")
    private String email;

    /**
     * The addressAttributes property.
     */
    @JsonProperty(value = "address_attributes")
    private PartnerCreateParamsAddressAttributes addressAttributes;

    /**
     * The partnerDocSettingAttributes property.
     */
    @JsonProperty(value = "partner_doc_setting_attributes")
    private PartnerCreateParamsPartnerDocSettingAttributes partnerDocSettingAttributes;

    /**
     * The partnerBankAccountAttributes property.
     */
    @JsonProperty(value = "partner_bank_account_attributes")
    private PartnerCreateParamsPartnerBankAccountAttributes partnerBankAccountAttributes;

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
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withCompanyId(int companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Get 取引先名 (255文字以内).
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 取引先名 (255文字以内).
     *
     * @param name the name value to set
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withName(String name) {
        this.name = name;
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
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get ショートカット１ (255文字以内).
     *
     * @return the shortcut1 value
     */
    public String shortcut1() {
        return this.shortcut1;
    }

    /**
     * Set ショートカット１ (255文字以内).
     *
     * @param shortcut1 the shortcut1 value to set
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withShortcut1(String shortcut1) {
        this.shortcut1 = shortcut1;
        return this;
    }

    /**
     * Get ショートカット２ (255文字以内).
     *
     * @return the shortcut2 value
     */
    public String shortcut2() {
        return this.shortcut2;
    }

    /**
     * Set ショートカット２ (255文字以内).
     *
     * @param shortcut2 the shortcut2 value to set
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withShortcut2(String shortcut2) {
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
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withLongName(String longName) {
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
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withNameKana(String nameKana) {
        this.nameKana = nameKana;
        return this;
    }

    /**
     * Get 敬称（御中、様、(空白)の3つから選択）. Possible values include: '', '(空白)', '御中', '様'.
     *
     * @return the defaultTitle value
     */
    public String defaultTitle() {
        return this.defaultTitle;
    }

    /**
     * Set 敬称（御中、様、(空白)の3つから選択）. Possible values include: '', '(空白)', '御中', '様'.
     *
     * @param defaultTitle the defaultTitle value to set
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withDefaultTitle(String defaultTitle) {
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
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get 営業担当者名 (255文字以内).
     *
     * @return the contactName value
     */
    public String contactName() {
        return this.contactName;
    }

    /**
     * Set 営業担当者名 (255文字以内).
     *
     * @param contactName the contactName value to set
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    /**
     * Get 営業担当者 メールアドレス (255文字以内).
     *
     * @return the email value
     */
    public String email() {
        return this.email;
    }

    /**
     * Set 営業担当者 メールアドレス (255文字以内).
     *
     * @param email the email value to set
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the addressAttributes value.
     *
     * @return the addressAttributes value
     */
    public PartnerCreateParamsAddressAttributes addressAttributes() {
        return this.addressAttributes;
    }

    /**
     * Set the addressAttributes value.
     *
     * @param addressAttributes the addressAttributes value to set
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withAddressAttributes(PartnerCreateParamsAddressAttributes addressAttributes) {
        this.addressAttributes = addressAttributes;
        return this;
    }

    /**
     * Get the partnerDocSettingAttributes value.
     *
     * @return the partnerDocSettingAttributes value
     */
    public PartnerCreateParamsPartnerDocSettingAttributes partnerDocSettingAttributes() {
        return this.partnerDocSettingAttributes;
    }

    /**
     * Set the partnerDocSettingAttributes value.
     *
     * @param partnerDocSettingAttributes the partnerDocSettingAttributes value to set
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withPartnerDocSettingAttributes(PartnerCreateParamsPartnerDocSettingAttributes partnerDocSettingAttributes) {
        this.partnerDocSettingAttributes = partnerDocSettingAttributes;
        return this;
    }

    /**
     * Get the partnerBankAccountAttributes value.
     *
     * @return the partnerBankAccountAttributes value
     */
    public PartnerCreateParamsPartnerBankAccountAttributes partnerBankAccountAttributes() {
        return this.partnerBankAccountAttributes;
    }

    /**
     * Set the partnerBankAccountAttributes value.
     *
     * @param partnerBankAccountAttributes the partnerBankAccountAttributes value to set
     * @return the PartnerCreateParams object itself.
     */
    public PartnerCreateParams withPartnerBankAccountAttributes(PartnerCreateParamsPartnerBankAccountAttributes partnerBankAccountAttributes) {
        this.partnerBankAccountAttributes = partnerBankAccountAttributes;
        return this;
    }

}