package fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.macbookpro.ob_wheels.R;

import activities.CalenderActivity;
import activities.SettingEDDActivity;
import activities.TraditionalWheelActivity;
import contracts.ObFragments;


public class HomeFragment extends Fragment implements ObFragments, View.OnClickListener {

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_main, container, false);
        init();
        return rootView;
    }

    private void init() {
        rootView.findViewById(R.id.button_cal).setOnClickListener(this);
        rootView.findViewById(R.id.button_wheel).setOnClickListener(this);
        rootView.findViewById(R.id.button_setting_edd).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_cal:
                startActivity(new Intent(getContext(), CalenderActivity.class));
                break;

            case R.id.button_wheel:
                startActivity(new Intent(getContext(), TraditionalWheelActivity.class));
                break;

            case R.id.button_setting_edd:
                startActivity(new Intent(getContext(), SettingEDDActivity.class));
                break;
        }
    }

    @Override
    public String getTitle() {
        return "Home";
    }
}
