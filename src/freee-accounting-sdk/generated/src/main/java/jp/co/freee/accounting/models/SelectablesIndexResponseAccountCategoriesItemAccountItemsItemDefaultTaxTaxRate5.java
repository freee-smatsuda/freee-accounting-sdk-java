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
 * The
 * SelectablesIndexResponseAccountCategoriesItemAccountItemsItemDefaultTaxTaxRate5
 * model.
 */
public class SelectablesIndexResponseAccountCategoriesItemAccountItemsItemDefaultTaxTaxRate5 {
    /**
     * 税区分ID.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /**
     * 税区分.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get 税区分ID.
     *
     * @return the id value
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set 税区分ID.
     *
     * @param id the id value to set
     * @return the SelectablesIndexResponseAccountCategoriesItemAccountItemsItemDefaultTaxTaxRate5 object itself.
     */
    public SelectablesIndexResponseAccountCategoriesItemAccountItemsItemDefaultTaxTaxRate5 withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get 税区分.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 税区分.
     *
     * @param name the name value to set
     * @return the SelectablesIndexResponseAccountCategoriesItemAccountItemsItemDefaultTaxTaxRate5 object itself.
     */
    public SelectablesIndexResponseAccountCategoriesItemAccountItemsItemDefaultTaxTaxRate5 withName(String name) {
        this.name = name;
        return this;
    }

}