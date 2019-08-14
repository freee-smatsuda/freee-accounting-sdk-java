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
 * The AccountItem model.
 */
public class AccountItem {
    /**
     * 勘定科目ID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /**
     * 勘定科目名 (30文字以内).
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * 事業所ID.
     */
    @JsonProperty(value = "company_id", required = true)
    private int companyId;

    /**
     * 税区分コード.
     */
    @JsonProperty(value = "tax_code", required = true)
    private int taxCode;

    /**
     * 勘定科目のカテゴリーコード.
     */
    @JsonProperty(value = "account_category_id", required = true)
    private int accountCategoryId;

    /**
     * ショートカット1 (20文字以内).
     */
    @JsonProperty(value = "shortcut")
    private String shortcut;

    /**
     * ショートカット2(勘定科目コード) (20文字以内).
     */
    @JsonProperty(value = "shortcut_num")
    private String shortcutNum;

    /**
     * 支出取引相手勘定科目ID.
     */
    @JsonProperty(value = "corresponding_type_expense", required = true)
    private int correspondingTypeExpense;

    /**
     * 収入取引相手勘定科目ID.
     */
    @JsonProperty(value = "corresponding_type_income", required = true)
    private int correspondingTypeIncome;

    /**
     * 検索可能:2, 検索不可：3.
     */
    @JsonProperty(value = "searchable", required = true)
    private int searchable;

    /**
     * 減価償却累計額勘定科目.
     */
    @JsonProperty(value = "accumulated_dep_account_item_name")
    private String accumulatedDepAccountItemName;

    /**
     * The items property.
     */
    @JsonProperty(value = "items")
    private List<AccountItemItemsItem> items;

    /**
     * The partners property.
     */
    @JsonProperty(value = "partners")
    private List<AccountItemPartnersItem> partners;

    /**
     * 勘定科目の使用設定（true: 使用する、false: 使用しない）.
     */
    @JsonProperty(value = "available", required = true)
    private boolean available;

    /**
     * 口座ID.
     */
    @JsonProperty(value = "walletable_id", required = true)
    private Integer walletableId;

    /**
     * Get 勘定科目ID.
     *
     * @return the id value
     */
    public int id() {
        return this.id;
    }

    /**
     * Set 勘定科目ID.
     *
     * @param id the id value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get 勘定科目名 (30文字以内).
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 勘定科目名 (30文字以内).
     *
     * @param name the name value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withName(String name) {
        this.name = name;
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
     * @return the AccountItem object itself.
     */
    public AccountItem withCompanyId(int companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Get 税区分コード.
     *
     * @return the taxCode value
     */
    public int taxCode() {
        return this.taxCode;
    }

    /**
     * Set 税区分コード.
     *
     * @param taxCode the taxCode value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withTaxCode(int taxCode) {
        this.taxCode = taxCode;
        return this;
    }

    /**
     * Get 勘定科目のカテゴリーコード.
     *
     * @return the accountCategoryId value
     */
    public int accountCategoryId() {
        return this.accountCategoryId;
    }

    /**
     * Set 勘定科目のカテゴリーコード.
     *
     * @param accountCategoryId the accountCategoryId value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withAccountCategoryId(int accountCategoryId) {
        this.accountCategoryId = accountCategoryId;
        return this;
    }

    /**
     * Get ショートカット1 (20文字以内).
     *
     * @return the shortcut value
     */
    public String shortcut() {
        return this.shortcut;
    }

    /**
     * Set ショートカット1 (20文字以内).
     *
     * @param shortcut the shortcut value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withShortcut(String shortcut) {
        this.shortcut = shortcut;
        return this;
    }

    /**
     * Get ショートカット2(勘定科目コード) (20文字以内).
     *
     * @return the shortcutNum value
     */
    public String shortcutNum() {
        return this.shortcutNum;
    }

    /**
     * Set ショートカット2(勘定科目コード) (20文字以内).
     *
     * @param shortcutNum the shortcutNum value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withShortcutNum(String shortcutNum) {
        this.shortcutNum = shortcutNum;
        return this;
    }

    /**
     * Get 支出取引相手勘定科目ID.
     *
     * @return the correspondingTypeExpense value
     */
    public int correspondingTypeExpense() {
        return this.correspondingTypeExpense;
    }

    /**
     * Set 支出取引相手勘定科目ID.
     *
     * @param correspondingTypeExpense the correspondingTypeExpense value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withCorrespondingTypeExpense(int correspondingTypeExpense) {
        this.correspondingTypeExpense = correspondingTypeExpense;
        return this;
    }

    /**
     * Get 収入取引相手勘定科目ID.
     *
     * @return the correspondingTypeIncome value
     */
    public int correspondingTypeIncome() {
        return this.correspondingTypeIncome;
    }

    /**
     * Set 収入取引相手勘定科目ID.
     *
     * @param correspondingTypeIncome the correspondingTypeIncome value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withCorrespondingTypeIncome(int correspondingTypeIncome) {
        this.correspondingTypeIncome = correspondingTypeIncome;
        return this;
    }

    /**
     * Get 検索可能:2, 検索不可：3.
     *
     * @return the searchable value
     */
    public int searchable() {
        return this.searchable;
    }

    /**
     * Set 検索可能:2, 検索不可：3.
     *
     * @param searchable the searchable value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withSearchable(int searchable) {
        this.searchable = searchable;
        return this;
    }

    /**
     * Get 減価償却累計額勘定科目.
     *
     * @return the accumulatedDepAccountItemName value
     */
    public String accumulatedDepAccountItemName() {
        return this.accumulatedDepAccountItemName;
    }

    /**
     * Set 減価償却累計額勘定科目.
     *
     * @param accumulatedDepAccountItemName the accumulatedDepAccountItemName value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withAccumulatedDepAccountItemName(String accumulatedDepAccountItemName) {
        this.accumulatedDepAccountItemName = accumulatedDepAccountItemName;
        return this;
    }

    /**
     * Get the items value.
     *
     * @return the items value
     */
    public List<AccountItemItemsItem> items() {
        return this.items;
    }

    /**
     * Set the items value.
     *
     * @param items the items value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withItems(List<AccountItemItemsItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Get the partners value.
     *
     * @return the partners value
     */
    public List<AccountItemPartnersItem> partners() {
        return this.partners;
    }

    /**
     * Set the partners value.
     *
     * @param partners the partners value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withPartners(List<AccountItemPartnersItem> partners) {
        this.partners = partners;
        return this;
    }

    /**
     * Get 勘定科目の使用設定（true: 使用する、false: 使用しない）.
     *
     * @return the available value
     */
    public boolean available() {
        return this.available;
    }

    /**
     * Set 勘定科目の使用設定（true: 使用する、false: 使用しない）.
     *
     * @param available the available value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withAvailable(boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Get 口座ID.
     *
     * @return the walletableId value
     */
    public Integer walletableId() {
        return this.walletableId;
    }

    /**
     * Set 口座ID.
     *
     * @param walletableId the walletableId value to set
     * @return the AccountItem object itself.
     */
    public AccountItem withWalletableId(Integer walletableId) {
        this.walletableId = walletableId;
        return this;
    }

}