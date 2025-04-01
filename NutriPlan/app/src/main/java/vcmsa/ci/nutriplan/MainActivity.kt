package vcmsa.ci.nutriplan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    val edtMealChoice = findViewById<EditText>(R.id.edtMealChoice)
    val btnContinue = findViewById<Button>(R.id.btnContinue)
    val btnDelete = findViewById<Button>(R.id.btnDelete)
    val txtResults = findViewById<TextView>(R.id.txtResults)

    btnContinue.setOnClickListener {
        val MealType = edtMealChoice.text.toString()
        var Suggestion = ""

        if (MealType == "Breakfast") {
            Suggestion = ("Blueberry Cornmeal pancakes and orange juice")}
         else if (MealType == "Brunch"){
            Suggestion = ("Fruit Salad bowl with Plain yogurt and a glass of water")}
        else if (MealType == "Lunch"){
            Suggestion = ("Avocado egg salad sandwich with Cranberry Juice")}
        else if (MealType == "Snacks"){
            Suggestion = (" Caramel pop corns")}
        else if (MealType == "Dinner"){
            Suggestion = ("Macaroni and Cheese with Broccoli salad and Apple Juice")}
        else if (MealType == "Dessert"){
            Suggestion = ("Malva Pudding")}
        else { Suggestion = "invalid" }

    txtResults.text = Suggestion
    }

    btnDelete.setOnClickListener {
        edtMealChoice.text.clear()
        txtResults.text = ""
    }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}