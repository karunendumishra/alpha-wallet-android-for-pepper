package com.pepperwallet.app.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.WindowManager;

import com.pepperwallet.app.R;
import com.pepperwallet.app.entity.Wallet;
import com.pepperwallet.app.widget.FunctionButtonBar;

import androidx.annotation.Nullable;

import static com.pepperwallet.app.C.Key.WALLET;
import static com.pepperwallet.app.entity.BackupState.SHOW_SEED_PHRASE_SINGLE;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class ScammerWarningActivity extends BaseActivity {
    private FunctionButtonBar functionButtonBar;
    private Wallet wallet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lockOrientation();
        toolbar();
        wallet = getIntent().getParcelableExtra(WALLET);
        setShowSeedPhraseSplash();
    }

    @SuppressLint("SourceLockedOrientationActivity")
    private void lockOrientation() {
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }

    private void setShowSeedPhraseSplash() {
        setContentView(R.layout.activity_show_seed);
        initViews();
        functionButtonBar.setPrimaryButtonText(R.string.show_seed_phrase);
        functionButtonBar.setPrimaryButtonClickListener(v -> {
            openBackupKeyActivity();
        });
    }

    private void openBackupKeyActivity() {
        Intent intent = new Intent(this, BackupKeyActivity.class);
        intent.putExtra(WALLET, wallet);
        intent.putExtra("STATE", SHOW_SEED_PHRASE_SINGLE);
        startActivity(intent);
    }

    private void initViews() {
        functionButtonBar = findViewById(R.id.layoutButtons);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        toolbar();
        setTitle(getString(R.string.empty));
    }
}
