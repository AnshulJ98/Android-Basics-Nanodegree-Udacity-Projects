package com.example.anshulj.booklisting;

import android.app.LoaderManager;
import android.content.Context;
import android.content.Loader;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements LoaderManager.LoaderCallbacks<List<Book>> {

    private TextView mEmptyStateTextView;
    private TextView mNoConnTextView;
    private static final int BOOK_LOADER_ID = 1;
    private BookAdapter mAdapter;
    static String qry = "";
    private static final String BASE_URL = "https://www.googleapis.com/books/v1/volumes?q=";
    private String BOOKS_URL = "https://www.googleapis.com/books/v1/volumes?q=" + qry;
    ListView bookListView;
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookListView = (ListView) findViewById(R.id.list);
        mAdapter = new BookAdapter(this, new ArrayList<Book>());
        bookListView.setAdapter(mAdapter);
        Log.e("URL", BOOKS_URL);
        mEmptyStateTextView = (TextView) findViewById(R.id.empty_view);
        mNoConnTextView = (TextView) findViewById(R.id.noconn_view);
        bookListView.setEmptyView(mEmptyStateTextView);
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            LoaderManager loaderManager = getLoaderManager();
            loaderManager.initLoader(BOOK_LOADER_ID, null, this);
        } else {
            View loadingIndicator = findViewById(R.id.loading_indicator);
            loadingIndicator.setVisibility(View.GONE);
            mNoConnTextView.setText(R.string.no_internet);
        }
        TextView sv = findViewById(R.id.search_view);
        sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = findViewById(R.id.edit_text);
                qry = editText.getText().toString();
                BOOKS_URL = BASE_URL + qry + "&maxResults=10";
                restart_Loader();

                ConnectivityManager connMgr = (ConnectivityManager)
                        getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
                if (networkInfo != null && networkInfo.isConnected()) {

                } else {
                    View loadingIndicator = findViewById(R.id.loading_indicator);
                    loadingIndicator.setVisibility(View.GONE);
                    mNoConnTextView.setText(R.string.no_internet);
                }
            }
        });

    }

    public void restart_Loader() {
        LoaderManager loaderManager = getLoaderManager();
        loaderManager.restartLoader(BOOK_LOADER_ID, null, this);
    }

    @Override
    public Loader<List<Book>> onCreateLoader(int i, Bundle bundle) {
        return new BooksLoader(this, BOOKS_URL);
    }

    @Override
    public void onLoadFinished(Loader<List<Book>> loader, List<Book> books) {
        View loadingIndicator = findViewById(R.id.loading_indicator);
        loadingIndicator.setVisibility(View.GONE);
        mAdapter.clear();
        if (books != null && !books.isEmpty()) {
            mAdapter.addAll(books);
        }
        mEmptyStateTextView.setText(R.string.no_books);


    }

    @Override
    public void onLoaderReset(Loader<List<Book>> loader) {
        mAdapter.clear();

    }

    @Override
    public void onPause() {
        super.onPause();
        pos = bookListView.getFirstVisiblePosition();
    }

    @Override
    public void onResume() {
        super.onResume();
        bookListView.setSelection(pos);
    }

}
