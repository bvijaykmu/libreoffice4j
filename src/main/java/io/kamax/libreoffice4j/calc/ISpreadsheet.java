/*
 * LibreOffice4j - LibreOffice Java API made easy
 * Copyright (C) 2017 Maxime Dor
 *
 * https://max.kamax.io/
 *
 * This file is part of LibreOffice4j
 *
 * LibreOffice4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.kamax.libreoffice4j.calc;

import io.kamax.libreoffice4j.table.ICell;
import io.kamax.libreoffice4j.table.IRow;
import io.kamax.libreoffice4j.table.IRowSerie;

public interface ISpreadsheet {

    ICell getCell(int col, int row);

    IRow getRow(int row);

    IRowSerie getRowSeries(int startIndex);

    void insertRowAboveAndCopy(int row);

    void copyCellRangeToPosition(String sourceRange, String destinationCell);

}
