package com.example.e_database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
	
	public static final String DATABASE_NAME="Student.db";
	public static final String TABLE_NAME="info";
	public static final String COL_1="STD_ID";
	public static final String COL_2="STD_NAME";
	public static final String COL_3="AVERAGE";
	
	
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, 1);
		// TODO Auto-generated constructor stub
	SQLiteDatabase db=this.getWritableDatabase();	
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String CREATE_TABLE="CREATE TABLE " + TABLE_NAME + " ("
				+ COL_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_2 +
				" TEXT, " + COL_3 + " TEXT" + ")";
		db.execSQL(CREATE_TABLE);		
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
		onCreate(db);
	}

}
