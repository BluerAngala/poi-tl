/*
 * Copyright 2014-2020 Sayi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.deepoove.poi.data;

import java.util.ArrayList;
import java.util.List;

import com.deepoove.poi.data.style.TableStyle;

/**
 * Data for table template
 * 
 * @author Sayi
 */
public class TableRenderData implements RenderData {

    private static final long serialVersionUID = 1L;

    private List<RowRenderData> rows = new ArrayList<>();
    private TableStyle tableStyle;

    MergeCellRule mergeRule;

    public List<RowRenderData> getRows() {
        return rows;
    }

    public void setRows(List<RowRenderData> rows) {
        this.rows = rows;
    }

    public TableStyle getTableStyle() {
        return tableStyle;
    }

    public void setTableStyle(TableStyle tableStyle) {
        this.tableStyle = tableStyle;
    }

    public MergeCellRule getMergeRule() {
        return mergeRule;
    }

    public void setMergeRule(MergeCellRule mergeRule) {
        this.mergeRule = mergeRule;
    }

    public TableRenderData addRow(RowRenderData row) {
        rows.add(row);
        return this;
    }

    public int obtainColSize() {
        if (null == rows || rows.isEmpty()) return 0;
        RowRenderData row = rows.get(0);
        List<CellRenderData> cells = row.getCells();
        if (null == cells || cells.isEmpty()) return 0;
        return cells.size();
    }

    public int obtainRowSize() {
        if (null == rows || rows.isEmpty()) return 0;
        return rows.size();
    }

}
