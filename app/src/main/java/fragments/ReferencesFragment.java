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
        View rootView = inflater.inflate(R.layout.fragment_text_title_body, container, false);
        TextView textViewTitle = (TextView) rootView.findViewById(R.id.text_view_title);
        TextView textViewBody = (TextView) rootView.findViewById(R.id.text_view_body);

        textViewTitle.setText("References");
        textViewBody.setText("Method for Estimating Due Date.  American College of Obstetricians and Gynecologists (ACOG).  Committee Opinion Number 611.  Obst Gyn vol. 124, no. 4, October, 2014.\n" +
                "\n" +
                "Bennett KA, et. al. First trimester ultrasound screening is effective in reducing postterm labor induction rates: a randomized controlled trial. Am J Obst Gyn 2004;190:1077–81.\n" +
                "\n" +
                "Whitworth M, et. al. Ultrasound for fetal assessment in early pregnancy. Cochrane Database of Systematic Reviews 2010, Issue 4. Art. No.: CD007058.\n" +
                "\n" +
                "Wegienka G, Baird DD. A comparison of recalled date of last menstrual period with prospectively recorded dates. J Womens Health 2005;14:248–52.");
        return rootView;
    }

    @Override
    public String getTitle() {
        return "References";
    }
}
