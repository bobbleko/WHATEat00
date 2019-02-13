package anunpongi.th.ac.rmutl.whateat;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Group2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Group2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Group2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Group2.
     */
    // TODO: Rename and change types and number of parameters
    public static Group2 newInstance(String param1 , String param2) {
        Group2 fragment = new Group2();
        Bundle args = new Bundle();
        args.putString( ARG_PARAM1 , param1 );
        args.putString( ARG_PARAM2 , param2 );
        fragment.setArguments( args );
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        if (getArguments() != null) {
            mParam1 = getArguments().getString( ARG_PARAM1 );
            mParam2 = getArguments().getString( ARG_PARAM2 );
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container ,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_group2 , container , false );
        Button group201 = view.findViewById( R.id.Group201 );
        group201.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Caculater.Allnum.add( 225 );
            }
        } );
        Button group202 = view.findViewById( R.id.Group202 );
        group202.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Caculater.Allnum.add( 210 );
            }
        } );
        Button group203 = view.findViewById( R.id.Group203 );
        group203.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Caculater.Allnum.add( 180 );
            }
        } );
        Button group204 = view.findViewById( R.id.Group204 );
        group204.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Caculater.Allnum.add( 160 );
            }
        } );
        Button group205 = view.findViewById( R.id.Group205 );
        group205.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Caculater.Allnum.add( 65 );
            }
        } );


        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction( uri );
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach( context );
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException( context.toString()
                    + " must implement OnFragmentInteractionListener" );
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
