package sg.edu.np.mad.madpractical2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Initialize a new User object
        User user = new User("John Doe", "MAD Developer", 1, false);

        // Get the TextViews and Button from the layout
        TextView tvName = findViewById(R.id.tvName);
        TextView tvDescription = findViewById(R.id.tvDescription);
        Button btnFollow = findViewById(R.id.btnFollow);

        // Set the TextViews with the User's name. description and default button message
        tvName.setText(user.name);
        tvDescription.setText(user.description);

        // Set the initial text for the follow button based on the followed status
        btnFollow.setText(user.followed ? "Unfollow" : "Follow");

        // Set a click listener for the button to toggle the followed status and update the button text
        btnFollow.setOnClickListener(v -> {
            user.followed = !user.followed;
            btnFollow.setText(user.followed ? "Unfollow" : "Follow");
        });
    }
}