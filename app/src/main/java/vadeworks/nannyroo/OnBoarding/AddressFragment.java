package vadeworks.nannyroo.OnBoarding;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gc.materialdesign.views.ButtonRectangle;

import vadeworks.nannyroo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddressFragment extends Fragment {


    public AddressFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_address, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        ButtonRectangle next = view.findViewById(R.id.next0);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Begin the transaction
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
// Replace the contents of the container with the new fragment
                ft.replace(R.id.addressFragment, new AddChildren());
                ft.addToBackStack(null);
// or ft.add(R.id.your_placeholder, new FooFragment());
// Complete the changes added above
                ft.commit();
            }
        });

    }
}
