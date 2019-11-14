package com.sushant.esoftwarica.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sushant.esoftwarica.R;
import com.sushant.esoftwarica.adapter.UserAdapter;
import com.sushant.esoftwarica.model.User;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    static List<User> userList=new ArrayList<>();


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = root.findViewById(R.id.recyclerview);


        User user= new User("sushant", "ktm", "22", "male");
        userList=user.getUserList();
        if(userList.isEmpty()) {
            userList.add(new User("sushant", "ktm", "22", "male"));
            userList.add(new User("sony", "ktm", "22", "female"));
            user.setUserList(userList);
        }


        UserAdapter adapter = new UserAdapter(getActivity(), userList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        return root;
    }
}