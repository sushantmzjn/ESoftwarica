package com.sushant.esoftwarica.ui.add;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.sushant.esoftwarica.R;
import com.sushant.esoftwarica.model.User;

import java.util.ArrayList;
import java.util.List;

public class AddFragment extends Fragment implements View.OnClickListener {

    private EditText sname, saddress, sage;
    private Button Abtn;
    private RadioGroup radioGroup;
    private RadioButton rmale, rfemale;
    String gender, name,address,Age;
    static List<User> userList = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_add, container, false);
        sname = root.findViewById(R.id.txtname);
        saddress = root.findViewById(R.id.txtaddress);
        sage = root.findViewById(R.id.txtage);
        Abtn = root.findViewById(R.id.btnadd);
        rmale = root.findViewById(R.id.rbm);
        rfemale = root.findViewById(R.id.rbf);
        radioGroup = root.findViewById(R.id.genderG);

        Abtn.setOnClickListener(this);


        return root;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnadd:
                 name = sname.getText().toString().trim();
                 address = saddress.getText().toString().trim();
                 Age = sage.getText().toString().trim();

                if (TextUtils.isEmpty(name)){
                    sname.setError("Enter Name");
                    return;
                }
                if (TextUtils.isEmpty(address)){
                    saddress.setError("Enter Address");
                    return;
                }
                if (TextUtils.isEmpty(Age)){
                    sage.setError("Enter Age");
                    return;
                }
                if (rmale.isChecked()){
                     gender = "male";
                }
                if (rfemale.isChecked()){
                    gender = "female";
                }

                User user = new User(name,address, Age, gender);
                userList = user.getUserList();
                userList.add(user);
                user.setUserList(userList);

                Toast.makeText(getActivity(), "User added Successfully", Toast.LENGTH_SHORT).show();

                sname.setText("");
                saddress.setText("");
                sage.setText("");
                rfemale.setText("");
                rmale.setText("");


            break;

        }

    }
}