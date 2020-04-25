package com.example.tech2020;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class CategoryFragment extends Fragment {

    private static int[] categoryImages = {
            R.drawable.public_disasters,
            R.drawable.school_disasters,
            R.drawable.medical_disasters_locked,
            R.drawable.car_disasters_locked,
            R.drawable.water_disasters_locked
    };

    private String categoryText[] = {
            "Public Disasters",
            "School Disasters",
            "Medical Disasters",
            "Car Disasters",
            "Water Disasters"};

    private static int[][] levelImageArrays = {
           {
                    R.drawable.level_11,
                    R.drawable.level_12,
                    R.drawable.level_13,
                    R.drawable.level_14
            },
            {
                    R.drawable.level_21,
                    R.drawable.level_22,
                    R.drawable.level_23,
                    R.drawable.level_24
            },
            {       R.drawable.level_31,
                    R.drawable.level_32,
                    R.drawable.level_33,
                    R.drawable.level_34
            },
            {
                    R.drawable.level_41,
                    R.drawable.level_42,
                    R.drawable.level_43,
                    R.drawable.level_44
            },
            {
                    R.drawable.level_51,
                    R.drawable.level_52,
                    R.drawable.level_53,
                    R.drawable.level_54
            }
    };

    static CategoryFragment newInstance(int position) {
        CategoryFragment frag = new CategoryFragment();
        Bundle args = new Bundle();

        args.putInt("position", position);
        frag.setArguments(args);

        return frag;
    }

    private void setImage(View v, int viewId, final int pos, final int level) {
        final int drawableId;
        if (level < 0) {
            drawableId = categoryImages[pos];
        } else {
            drawableId = levelImageArrays[pos][level];
        }
        Drawable d = getResources().getDrawable( drawableId, requireActivity().getTheme());
        ((ImageView)v.findViewById(viewId)).setImageDrawable(d);

        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View v) {
                if (pos == 0 && level == 0) {
                    Intent intent = new Intent(getActivity(), StreetDisastersShooting.class);
                    startActivity(intent);
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setMessage(String.format("Category %s, level %s", categoryImages[pos], getString(drawableId)))
                            .setTitle("This category+level is not available now");
                    builder.create().show();
                }
            }
        };
        if (level >= 0) {
            ((ImageView)v.findViewById(viewId)).setOnClickListener(listener);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.category, container, false);
        int position = getArguments().getInt("position", 0);

        setImage(view, R.id.category_view, position, -1);

        setImage(view, R.id.level1, position, 0);
        setImage(view, R.id.level2, position, 1);
        setImage(view, R.id.level3, position, 2);
        setImage(view, R.id.level4, position, 3);

        TextView levelText = view.findViewById(R.id.level_text);
        levelText.setText(String.format("Click level for %s", categoryText[position]));
        return view;
    }
}
