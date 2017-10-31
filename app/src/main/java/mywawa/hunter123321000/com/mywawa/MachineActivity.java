package mywawa.hunter123321000.com.mywawa;

import android.os.Bundle;
import android.support.annotation.StringDef;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MachineActivity extends AppCompatActivity {
    private DatabaseReference reference;
    private FirebaseRecyclerAdapter<Machine,machineHolder> adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        reference = FirebaseDatabase.getInstance().getReference(Machine.REF_EXPENSES);

        recyclerView.setHasFixedSize(false);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setReverseLayout(false);
        recyclerView.setLayoutManager(manager);



        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Toast.makeText(MachineActivity.this, dataSnapshot.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(MachineActivity.this, databaseError.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        adapter = new FirebaseRecyclerAdapter<Machine, machineHolder>(Machine.class,
                android.R.layout.two_line_list_item, machineHolder.class, reference) {
            @Override
            protected void populateViewHolder(machineHolder viewHolder, Machine machine, int position) {
                viewHolder.setValues(position,machine);
            }
        };

        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
    public static class machineHolder extends RecyclerView.ViewHolder {
        private final TextView textViewDate;
        private final TextView textViewItem;

        public machineHolder(View itemView) {
            super(itemView);
            textViewDate = (TextView) itemView.findViewById(android.R.id.text1);
            textViewItem = (TextView) itemView.findViewById(android.R.id.text2);
        }

        public void setValues(int position,Machine machine){
            String str_machineId = "00"+String.valueOf(position+1);
        textViewDate.setText("機器編號："+str_machineId+"，營運金額："+String.valueOf(machine.getAccount()));
        textViewItem.setText("出貨數量："+machine.getGiftOut()+"，剩餘數量"+machine.getGiftIn());
        }
    }
}
