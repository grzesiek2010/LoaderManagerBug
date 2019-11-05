package com.example.loadermanagerbug;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.CursorLoader;
import androidx.loader.content.Loader;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportLoaderManager().initLoader(0x01, null, this);
    }

    @NonNull
    @Override
    public Loader<Cursor> onCreateLoader(int id, @Nullable Bundle args) {
        Log.i("LOADER", "onCreateLoader called");
        return new CursorLoader(this, Uri.parse(""), null, null, null, null);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<Cursor> loader, Cursor data) {
        Log.i("LOADER", "onLoadFinished called");
    }

    @Override
    public void onLoaderReset(@NonNull Loader<Cursor> loader) {
        Log.i("LOADER", "onLoaderReset called");
    }
}
