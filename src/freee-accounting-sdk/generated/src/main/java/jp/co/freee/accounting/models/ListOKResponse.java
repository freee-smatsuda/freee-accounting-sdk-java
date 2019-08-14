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
 * The ListOKResponse model.
 */
public class ListOKResponse {
    /**
     * The companies property.
     */
    @JsonProperty(value = "companies", required = true)
    private List<ListOKResponseCompaniesItem> companies;

    /**
     * Get the companies value.
     *
     * @return the companies value
     */
    public List<ListOKResponseCompaniesItem> companies() {
        return this.companies;
    }

    /**
     * Set the companies value.
     *
     * @param companies the companies value to set
     * @return the ListOKResponse object itself.
     */
    public ListOKResponse withCompanies(List<ListOKResponseCompaniesItem> companies) {
        this.companies = companies;
        return this;
    }

}