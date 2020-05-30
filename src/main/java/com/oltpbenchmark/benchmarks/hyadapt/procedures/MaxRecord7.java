/*
 * Copyright 2020 by OLTPBenchmark Project
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
 *
 */

package com.oltpbenchmark.benchmarks.hyadapt.procedures;

import com.oltpbenchmark.api.Procedure;
import com.oltpbenchmark.api.SQLStmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MaxRecord7 extends Procedure {
    public final SQLStmt maxStmt = new SQLStmt(
            "SELECT MAX(FIELD198), MAX(FIELD206), MAX(FIELD169), MAX(FIELD119), MAX(FIELD9), MAX(FIELD220), MAX(FIELD2), MAX(FIELD230), MAX(FIELD212), MAX(FIELD164), MAX(FIELD111), MAX(FIELD136), MAX(FIELD106), MAX(FIELD8), MAX(FIELD112), MAX(FIELD4), MAX(FIELD234), MAX(FIELD147), MAX(FIELD35), MAX(FIELD114), MAX(FIELD89), MAX(FIELD127), MAX(FIELD144), MAX(FIELD71), MAX(FIELD186), "
                    + "MAX(FIELD34), MAX(FIELD145), MAX(FIELD124), MAX(FIELD146), MAX(FIELD7), MAX(FIELD40), MAX(FIELD227), MAX(FIELD59), MAX(FIELD190), MAX(FIELD249), MAX(FIELD157), MAX(FIELD38), MAX(FIELD64), MAX(FIELD134), MAX(FIELD167), MAX(FIELD63), MAX(FIELD178), MAX(FIELD156), MAX(FIELD94), MAX(FIELD84), MAX(FIELD187), MAX(FIELD153), MAX(FIELD158), MAX(FIELD42), MAX(FIELD236), "
                    + "MAX(FIELD83), MAX(FIELD182), MAX(FIELD107), MAX(FIELD76), MAX(FIELD58), MAX(FIELD102), MAX(FIELD96), MAX(FIELD31), MAX(FIELD244), MAX(FIELD54), MAX(FIELD37), MAX(FIELD228), MAX(FIELD24), MAX(FIELD120), MAX(FIELD92), MAX(FIELD233), MAX(FIELD170), MAX(FIELD209), MAX(FIELD93), MAX(FIELD12), MAX(FIELD47), MAX(FIELD200), MAX(FIELD248), MAX(FIELD171), MAX(FIELD22), "
                    + "MAX(FIELD166), MAX(FIELD213), MAX(FIELD101), MAX(FIELD97), MAX(FIELD29), MAX(FIELD237), MAX(FIELD149), MAX(FIELD49), MAX(FIELD142), MAX(FIELD181), MAX(FIELD196), MAX(FIELD75), MAX(FIELD188), MAX(FIELD208), MAX(FIELD218), MAX(FIELD183), MAX(FIELD250), MAX(FIELD151), MAX(FIELD189), MAX(FIELD60), MAX(FIELD226), MAX(FIELD214), MAX(FIELD174), MAX(FIELD128), MAX(FIELD239), "
                    + "MAX(FIELD27), MAX(FIELD235), MAX(FIELD217), MAX(FIELD98), MAX(FIELD143), MAX(FIELD165), MAX(FIELD160), MAX(FIELD109), MAX(FIELD65), MAX(FIELD23), MAX(FIELD74), MAX(FIELD207), MAX(FIELD115), MAX(FIELD69), MAX(FIELD108), MAX(FIELD30), MAX(FIELD201), MAX(FIELD221), MAX(FIELD202), MAX(FIELD20), MAX(FIELD225), MAX(FIELD105), MAX(FIELD91), MAX(FIELD95), MAX(FIELD150), "
                    + "MAX(FIELD123), MAX(FIELD16), MAX(FIELD238), MAX(FIELD81), MAX(FIELD3), MAX(FIELD219), MAX(FIELD204), MAX(FIELD68), MAX(FIELD203), MAX(FIELD73), MAX(FIELD41), MAX(FIELD66), MAX(FIELD192), MAX(FIELD113), MAX(FIELD216), MAX(FIELD117), MAX(FIELD99), MAX(FIELD126), MAX(FIELD53), MAX(FIELD1), MAX(FIELD139), MAX(FIELD116), MAX(FIELD229), MAX(FIELD100), MAX(FIELD215), "
                    + "MAX(FIELD48), MAX(FIELD10), MAX(FIELD86), MAX(FIELD211), MAX(FIELD17), MAX(FIELD224), MAX(FIELD122), MAX(FIELD51), MAX(FIELD103), MAX(FIELD85), MAX(FIELD110), MAX(FIELD50), MAX(FIELD162), MAX(FIELD129), MAX(FIELD243), MAX(FIELD67), MAX(FIELD133), MAX(FIELD138), MAX(FIELD193), MAX(FIELD141), MAX(FIELD232), MAX(FIELD118), MAX(FIELD159), MAX(FIELD199), MAX(FIELD39) "
                    + "FROM HTABLE WHERE FIELD1>?");

    public void run(Connection conn, int keyname) throws SQLException {
        PreparedStatement stmt = this.getPreparedStatement(conn, maxStmt);
        stmt.setInt(1, keyname);
        int max = -1;
        ResultSet r = stmt.executeQuery();
        if (r.next()) {
            max = r.getInt(1);
        }

        r.close();
    }

}
