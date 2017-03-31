package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.macbookpro.ob_wheels.R;

import contracts.ObFragments;


public class MoreAppsFragment extends Fragment implements ObFragments {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_text_title_body, container, false);
        TextView textViewTitle = (TextView) rootView.findViewById(R.id.text_view_title);
        TextView textViewBody = (TextView) rootView.findViewById(R.id.text_view_body);

        textViewTitle.setText("Coming soon...");
        textViewBody.setText("");
        return rootView;
    }

    @Override
    public String getTitle() {
        return "More Apps";
    }
}
