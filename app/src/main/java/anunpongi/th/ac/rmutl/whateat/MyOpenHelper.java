package anunpongi.th.ac.rmutl.whateat;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyOpenHelper extends SQLiteOpenHelper {

    private Context context;
    public static final String database_name = "anunpong.db";
    private static final int database_version = 1;
    private static final String sql_command = "CREATE TABLE userTABER (" +
            "ID INTEGER PRIMARY KEY," +
            "Name TEXT," +
            "Surname TEXT," +
            "Gender TEXT," +
            "Age TEXT," +
            "Stature TEXT,"+
            "Kg TEXT);";



    public MyOpenHelper(Context context) {
        super(context,database_name, null, database_version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql_command);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db , int oldVersion , int newVersion) {

    }

}
