package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.macbookpro.ob_wheels.R;

import contracts.ObFragments;


public class DisclaimerFragment extends Fragment implements ObFragments {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_text_title_body, container, false);
        TextView textViewTitle = (TextView) rootView.findViewById(R.id.text_view_title);
        TextView textViewBody = (TextView) rootView.findViewById(R.id.text_view_body);

        textViewTitle.setText("Accuracy & Disclaimer");
        textViewBody.setText("Calendar:  the calendar is accurate even in leap years.  But you have to know how to apply this information to individual patient care and make adjustments as clinically appropriate.  \n" +
                "\n" +
                "OB wheel:  most cardboard wheels have some inaccuracy.  I have found this wheel to be geometrically and clinically accurate (except for leap years as there is no adjustment for a February with 29 days).  However, if you are uncertain about the results, feel free to double-check on the calendar calculator.  It is based upon your discretion and clinical judgement whether and how to use the cycle length adjustment or stick with the standard 28 day cycle.\n" +
                "\n" +
                "Scheme for reconciling LMP & Sono EDD's:  there are several schemes in clinical use for setting a final due date from the LMP and Sono.  I am unaware of evidence which proves any one scheme superior to another.  I have presented the ACOG scheme because we use it in our practice.  If you prefer another scheme, you may use your discretion and use it.\n" +
                "\n" +
                "If you suspect there is an inaccuracy in any of the tools in this app, please contact me as soon as possible.  \n" +
                "\n" +
                "Finally, like all my apps, this tool provides information about care of patients in general.  But it may not provide guidance on the single unique patient before you this moment.  This tool is no substitute for training, experience, and judgment.  You must already know all about setting due dates and gestational ages, this tool merely puts assistance at your fingertips.  Individualize your care to your patient, your local standards, your local resources, and new information as it comes out.");
        return rootView;
    }

    @Override
    public String getTitle() {
        return "Disclaimer";
    }
}
