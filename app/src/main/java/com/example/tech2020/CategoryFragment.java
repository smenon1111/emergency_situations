package com.example.tech2020;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class CategoryFragment extends Fragment {

    private static int[] categoryImages = {
            R.drawable.public_disasters,
            R.drawable.category_naturaldisasters,
            R.drawable.medical_disasters_locked,
            R.drawable.car_disasters_locked,
            R.drawable.water_disasters_locked
    };

    private String categoryText[] = {
            "Public Disasters",
            "Natural Disasters",
            "Medical Disasters",
            "Car Disasters",
            "Water Disasters"};

    private static int[][] levelImageArrays = {
           {
                    R.drawable.shooting_publicdisasters,
                    R.drawable.kidnapping_publicdisasters,
                    R.drawable.robbery_publicdisasters,
                    R.drawable.carcrash_publicdisasters
            },
            {
                    R.drawable.earthquake_naturaldisasters,
                    R.drawable.wildfire_naturaldisasters,
                    R.drawable.flood_naturaldisasters,
                    R.drawable.tornado_naturaldisasters
            },
            {       R.drawable.heartattack_medicaldisaster,
                    R.drawable.stroke_medicaldisaster,
                    R.drawable.fainting_medicaldisaster,
                    R.drawable.allergey_medicaldisaster
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
