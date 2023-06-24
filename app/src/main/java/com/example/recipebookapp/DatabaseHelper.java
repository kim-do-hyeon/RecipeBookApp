package com.example.recipebookapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "recipe.db";
    private static final int DATABASE_VERSION = 1;

    // 테이블 및 열 이름
    public static final String TABLE_RECIPE = "recipe";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_INGREDIENT_NAME = "ingredient_name";
    public static final String COLUMN_INGREDIENT_QUANTITY = "ingredient_quantity";
    public static final String COLUMN_PURCHASE_LINK = "purchase_link";
    public static final String COLUMN_RECIPE_STEP = "recipe_step";

    // 생성자
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // 레시피 테이블 생성 쿼리
        String createRecipeTableQuery = "CREATE TABLE " + TABLE_RECIPE + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TITLE + " TEXT, " +
                COLUMN_INGREDIENT_NAME + " TEXT, " +
                COLUMN_INGREDIENT_QUANTITY + " TEXT, " +
                COLUMN_PURCHASE_LINK + " TEXT, " +
                COLUMN_RECIPE_STEP + " TEXT" +
                ")";

        db.execSQL(createRecipeTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // 기존 테이블 삭제 및 새로 생성
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RECIPE);
        onCreate(db);
    }
}
