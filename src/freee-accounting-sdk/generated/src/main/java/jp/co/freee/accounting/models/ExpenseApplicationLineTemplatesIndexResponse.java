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
 * The ExpenseApplicationLineTemplatesIndexResponse model.
 */
public class ExpenseApplicationLineTemplatesIndexResponse {
    /**
     * The expenseApplicationLineTemplates property.
     */
    @JsonProperty(value = "expense_application_line_templates", required = true)
    private List<ExpenseApplicationLineTemplate> expenseApplicationLineTemplates;

    /**
     * Get the expenseApplicationLineTemplates value.
     *
     * @return the expenseApplicationLineTemplates value
     */
    public List<ExpenseApplicationLineTemplate> expenseApplicationLineTemplates() {
        return this.expenseApplicationLineTemplates;
    }

    /**
     * Set the expenseApplicationLineTemplates value.
     *
     * @param expenseApplicationLineTemplates the expenseApplicationLineTemplates value to set
     * @return the ExpenseApplicationLineTemplatesIndexResponse object itself.
     */
    public ExpenseApplicationLineTemplatesIndexResponse withExpenseApplicationLineTemplates(List<ExpenseApplicationLineTemplate> expenseApplicationLineTemplates) {
        this.expenseApplicationLineTemplates = expenseApplicationLineTemplates;
        return this;
    }

}