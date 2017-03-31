package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.macbookpro.ob_wheels.R;

import contracts.ObFragments;


public class AboutFragment extends Fragment implements ObFragments {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_text_title_body, container, false);
        TextView textViewTitle = (TextView) rootView.findViewById(R.id.text_view_title);
        TextView textViewBody = (TextView) rootView.findViewById(R.id.text_view_body);

        textViewTitle.setText("Development of app");
        textViewBody.setText("Written to put due date calculator tools and information about " +
                "setting the due date in the hands of clinicians, students, and residents " +
                "at the point of care.\n" +

                "\nContent+Design: Joshua Steinberg MD," +
                "\nUHS Wilson Family Practice Residency," +
                "\nBinghamton NY\n" +
                "\nProgrammer: Joshua Steinberg MD;" +
                "\nHeeRak Kang MSII, SUNY Upstate" +
                "\nMedical University, Syracuse NY" +
                "\n" +
                "Feedback: jds.pocapps@gmail.com\n" +
                "Platform: iOS 7.0 and later\n" +
                "Version: 1.0\n" +
                "Copyright: March, 2015");
        return rootView;
    }

    @Override
    public String getTitle() {
        return "About";
    }
}
