//----------------------------------------------------------------------------
//
// Module:      SimpleTextIStatement.java
//
// Description: Interface of the SimpleTextStatement class.  This class
//              resolves circular dependancies.
//
// Author:      Karl Moss
//
// Copyright:   (C) 1996,1997 Karl Moss.  All rights reserved.
//              You may study, use, modify and distribute this example
//              for any purpose, provided that this copyright notice
//              appears in all copies.  This example is provided WITHOUT
//              WARRANTY either expressed or implied.
//----------------------------------------------------------------------------

package jdbc.SimpleText;
import java.sql.*;
import java.util.Hashtable;

public interface SimpleTextIStatement
    extends        java.sql.Statement
{
    Connection getConnection();

    int buildList(String sql[], int pos, String endWord, Hashtable list)
                    throws SQLException;
}

