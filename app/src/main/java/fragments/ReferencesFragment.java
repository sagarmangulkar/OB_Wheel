package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.macbookpro.ob_wheels.R;

import contracts.ObFragments;


public class ReferencesFragment extends Fragment implements ObFragments {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ob_landing, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText("AAAA");
        return rootView;
    }

    @Override
    public String getTitle() {
        return "References";
    }
}
