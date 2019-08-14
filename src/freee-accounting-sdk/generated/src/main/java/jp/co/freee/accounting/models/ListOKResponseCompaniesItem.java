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
 * The ListOKResponseCompaniesItem model.
 */
public class ListOKResponseCompaniesItem {
    /**
     * 事業所ID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /**
     * 事業所名.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * 事業所名（カナ）.
     */
    @JsonProperty(value = "name_kana", required = true)
    private String nameKana;

    /**
     * 事業所名.
     */
    @JsonProperty(value = "display_name", required = true)
    private String displayName;

    /**
     * ユーザーの権限. Possible values include: 'admin', 'simple_accounting',
     * 'self_only', 'read_only'.
     */
    @JsonProperty(value = "role", required = true)
    private String role;

    /**
     * Get 事業所ID.
     *
     * @return the id value
     */
    public int id() {
        return this.id;
    }

    /**
     * Set 事業所ID.
     *
     * @param id the id value to set
     * @return the ListOKResponseCompaniesItem object itself.
     */
    public ListOKResponseCompaniesItem withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get 事業所名.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 事業所名.
     *
     * @param name the name value to set
     * @return the ListOKResponseCompaniesItem object itself.
     */
    public ListOKResponseCompaniesItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get 事業所名（カナ）.
     *
     * @return the nameKana value
     */
    public String nameKana() {
        return this.nameKana;
    }

    /**
     * Set 事業所名（カナ）.
     *
     * @param nameKana the nameKana value to set
     * @return the ListOKResponseCompaniesItem object itself.
     */
    public ListOKResponseCompaniesItem withNameKana(String nameKana) {
        this.nameKana = nameKana;
        return this;
    }

    /**
     * Get 事業所名.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set 事業所名.
     *
     * @param displayName the displayName value to set
     * @return the ListOKResponseCompaniesItem object itself.
     */
    public ListOKResponseCompaniesItem withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get ユーザーの権限. Possible values include: 'admin', 'simple_accounting', 'self_only', 'read_only'.
     *
     * @return the role value
     */
    public String role() {
        return this.role;
    }

    /**
     * Set ユーザーの権限. Possible values include: 'admin', 'simple_accounting', 'self_only', 'read_only'.
     *
     * @param role the role value to set
     * @return the ListOKResponseCompaniesItem object itself.
     */
    public ListOKResponseCompaniesItem withRole(String role) {
        this.role = role;
        return this;
    }

}