package com.android.test.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.android.test.R;
import com.android.test.fragment.ResultListFragment;

import roboguice.inject.InjectView;

public class ResultListActivity extends AbstractActionBarActivity {

    @InjectView(R.id.material_toolbar)
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void setInitialFragment() {
        setInitialFragment(R.layout.activity_main, R.id.container, ResultListFragment.newInstance());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
