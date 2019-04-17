package DTO;

/**
 * Created by Jawad Khan on 6/3/2018.
 */

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity (tableName = "diseases")
public class diseaseEntity {
    @PrimaryKey (autoGenerate = true)
    private int id;

    @ColumnInfo(name = "Name")
    private String name;

    @ColumnInfo(name = "Description")
    private String description;

    @ColumnInfo(name = "Causes")
    private String causes;

    @ColumnInfo(name = "Symptoms")
    private String symptoms;

    @ColumnInfo(name = "Diet")
    private String diet;

    @ColumnInfo(name = "Prevention")
    private String prevention;

    public diseaseEntity(String name, String description, String causes, String symptoms, String diet, String prevention) {
        this.name = name;
        this.description = description;
        this.causes = causes;
        this.symptoms = symptoms;
        this.diet = diet;
        this.prevention = prevention;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCauses() {
        return causes;
    }

    public void setCauses(String causes) {
        this.causes = causes;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getPrevention() {
        return prevention;
    }

    public void setPrevention(String prevention) {
        this.prevention = prevention;
    }

    public static diseaseEntity[] populateData() {
        return new diseaseEntity[] {
                new diseaseEntity("Aids", "AIDS stands for Acquired Immune Deficiency Syndrome.\n" + "AIDS is caused by a virus called the Human Immunodeficiency Virus (HIV). If you get infected with HIV, your body will try to fight the infection. It will make \"antibodies,\" special immune molecules the body makes to fight HIV. AIDS is the most advanced stage of infection caused by HIV. The names HIV and AIDS can be confusing because both terms describe the same disease. But most people who are HIV positive do not have AIDS.\n" +  "A person with HIV infection is said to have AIDS when his or her immune system becomes so weak it can't fight off certain kinds of infections and cancers, such as PCP (a type of pneumonia) or KS (Kaposi sarcoma, a type of cancer that affects the skin and internal organs), wasting syndrome (involuntary weight loss), memory impairment, or tuberculosis.\n \n" +
                        "Even without one of these infections, a person with HIV is diagnosed with AIDS if his or her immune system weakens, as indicated by the number of CD4 cells in his or her blood--if the CD4 cell count is less than 200, the person is given a diagnosis of AIDS. It can take 2 to 10 years, or longer, for someone with HIV to develop AIDS if he or she is not treated. Most people with HIV will not develop AIDS if they start treatment (with medicines called antiretroviral therapy or ART) soon after becoming infected."
                        , "HIV is a retrovirus that infects the vital organs and cells of the human immune system. The virus progresses in the absence of antiretroviral therapy (ART) - a drug therapy that slows or prevents the virus from developing. The rate of virus progression varies widely between individuals and depends on many factors. These factors include the age of the individual, the body's ability to defend against HIV, access to healthcare, the presence of other infections, the individual's genetic inheritance, resistance to certain strains of HIV, and more."
                        , "Some people with HIV infection have no symptoms until several months or even years after contracting the virus. However, around 80 percent may develop symptoms similar to flu 2–6 weeks after catching the virus. This is called acute retroviral syndrome.\n" +
                        "\n" +
                        "The symptoms of early HIV infection may include:\n \n" +
                        "1. Fever\n" +
                        "2. Chills\n" +
                        "3. Joint pain\n" +
                        "4. Muscle aches\n" +
                        "5. Sore throat\n" +
                        "6. Sweats (particularly at night)\n" +
                        "7. Enlarged glands\n" +
                        "8. A red rash\n" +
                        "9. Tiredness\n" +
                        "10. Weakness\n" +
                        "11. Unintentional weight loss\n" +
                        "12. Thrush\n" +
                        "\n It is important to remember that these symptoms appear when the body is fighting off many types of viruses, not just HIV. However, if you have several of these symptoms and believe you could have been at risk of contracting HIV in the last few weeks, you should take a test."
                        , "People living with HIV should aim to eat a balanced diet, without too much fat, sugar or salt. For many people, eating well is a pleasure, and learning how to cook and prepare food for yourself, your family, or friends can be fun.\n" +
                        "\n" +
                        "If you are underweight – perhaps because HIV was already making you ill by the time you were diagnosed – or overweight, or if you have any particular dietary problems or side-effects that make it hard to eat well, then you might benefit from talking to a healthcare professional about your diet.\n" +
                        "\n" +
                        "To make it easier to understand what a balanced diet is made up of, it can help to think about the type of foods you eat. Your diet should be made up of:\n" +
                        "\n" +
                        "-> Plenty of fruit and vegetables to provide fibre, vitamins and minerals\n" +
                        "-> Plenty of starchy carbohydrates to give you energy – such as brown rice, potatoes, wholemeal pasta and bread\n" +
                        "-> Some protein such as lean meat, fish, eggs and beans\n" +
                        "-> Some dairy products, such as milk, yoghurt and cheese\n" +
                        "-> Small amounts of fats and sugars\n"
                        , "There is no special food to avoid of being Aids patient."),
                new diseaseEntity("Thalassemia", "Thalassemia is an inherited blood disorder in which the body makes an abnormal form of hemoglobin. Hemoglobin is the protein molecule in red blood cells that carries oxygen.\n" +
                        "\n" +
                        "The disorder results in excessive destruction of red blood cells, which leads to anemia. Anemia is a condition in which your body doesn’t have enough normal, healthy red blood cells.\n" +
                        "\n" +
                        "Thalassemia is inherited, meaning that at least one of your parents must be a carrier of the disease. It’s caused by either a genetic mutation or a deletion of certain key gene fragments.\n" +
                        "\n" +
                        "Thalassemia minor is a less serious form of the disorder. There are two main forms of thalassemia that are more serious. In alpha thalassemia, at least one of the alpha globin genes has a mutation or abnormality. In beta thalassemia, the beta globin genes are affected.\n" +
                        "\n" +
                        "Each of these forms of thalassemia has different subtypes. The exact form you have will affect the severity of your symptoms and your outlook.\n"
                        , "Thalassemia occurs when there’s an abnormality or mutation in one of the genes involved in hemoglobin production. You inherit this genetic defect from your parents.\n" +
                        "\n" +
                        "If only one of your parents is a carrier for thalassemia, you may develop a form of the disease known as thalassemia minor. If this occurs, you probably won’t have symptoms, but you’ll be a carrier of the disease. Some people with thalassemia minor do develop minor symptoms.\n" +
                        "\n" +
                        "If both of your parents are carriers of thalassemia, you have a greater chance of inheriting a more serious form of the disease.\n" +
                        "\n" +
                        "According to the Centers for Disease Control and Prevention (CDC), thalassemia is most common in people from Asia, the Middle East, Africa, and Mediterranean countries such as Greece and Turkey.\n"
                        , "The symptoms of thalassemia can vary. Some of the most common ones include:\n" +
                        "\n" +
                        "1. Bone deformities, especially in the face\n" +
                        "2. Dark urine\n" +
                        "3. Delayed growth and development\n" +
                        "4. Excessive tiredness and fatigue\n" +
                        "5. Yellow or pale skin\n" +
                        "Not everyone has visible symptoms of thalassemia. Signs of the disorder also tend to show up later in childhood or adolescence.\n"
                        , "Patients should be evaluated annually by a registered dietitian regarding adequate dietary intake of calcium, vitamin D, folate, trace minerals (copper, zinc, and selenium) and antioxidant vitamins (E and C). Annual nutritional laboratory testing should include albumin, 25-hydroxy vitamin D, fasting glucose, fasting plasma zinc, serum copper, ceruloplasmin, serum selenium, alpha and gamma tocopherol, plasma ascorbate, and serum folate. (See nutrition table below.)\n" +
                        "\n" +
                        "Recommendations for dietary supplementation should be made as indicated by nutritional history, complications of the disease, and, in children, growth status. Typically multivitamin supplementation without iron is suggested (e.g., Centrum Silver in tablet or chewable form is now available).\n" +
                        "\n" +
                        "For nontransfused thalassemia patients, folate supplementation (1 mg daily) is recommended, and consuming a moderately low-iron diet is encouraged—that is, avoiding iron-fortified cereals and other products and excessive consumption of red meat. Drinking black tea with meals is recommended to reduce iron absorption from food.\n" +
                        "\n" +
                        "For transfused patients on chelation therapy, a low-iron diet is unnecessary and may decrease the quality of life for some patients. The amount of iron obtained from just one unit of packed red cells (200 mg) far outweighs the amount of iron obtained from a 3-ounce steak (5 mg).\n" +
                        "\n" +
                        "Vitamin D supplementation (50,000 IU once a week until levels normalize) is recommended for patients with a 25-hydroxy vitamin D less than 20 ng/dL. Calcium supplementation should be encouraged if dietary intake is insufficient.\n"
                        , "Very high iron sources are found in the following foods; they should be avoided or eliminated from the diet:\n" +
                        "\n" +
                        "Proteins that should be avoided or eliminated from the diet:\n" +
                        "\n" +
                        "-Oysters\n" +
                        "-Liver\n" +
                        "-Pork\n" +
                        "-Beans\n" +
                        "-Beef\n" +
                        "-Peanut butter\n" +
                        "-Tofu\n" +
                        "Grains that should be avoided or eliminated from the diet:\n" +
                        "\n" +
                        "-Flour tortillas\n" +
                        "-Infant cereal\n" +
                        "-Cream of wheat\n" +
                        "-Malt-O-Meal\n" +
                        "-Cereals, such as Most, Product 19, Total, Kix, All Bran, Life, Raisin Bran, Special K, 100% Bran, Rice Chex, Rice Krispies, Cornflakes, Wheaties\n" +
                        "Fruits/Vegetables that should be avoided or eliminated from the diet:\n" +
                        "\n" +
                        "-Prune juice\n" +
                        "-Prunes\n" +
                        "-Watermelon\n" +
                        "-Spinach\n" +
                        "-Leafy green vegetables\n" +
                        "-Dates\n" +
                        "-Raisins\n" +
                        "-Broccoli\n" +
                        "-Peas\n" +
                        "-Fava beans"),
                new diseaseEntity("Hepatitis", "Hepatitis refers to an inflammatory condition of the liver. It’s commonly caused by a viral infection, but there are other possible causes of hepatitis. These include autoimmune hepatitis and hepatitis that occurs as a secondary result of medications, drugs, toxins, and alcohol. Autoimmune hepatitis is a disease that occurs when your body makes antibodies against your liver tissue.\n" +
                        "\n" +
                        "Your liver is located in the right upper area of your abdomen. It performs many critical functions that affect metabolism throughout your body, including:\n" +
                        "\n" +
                        "Bile production, which is essential to digestion\n" +
                        "Filtering of toxins from your body\n" +
                        "Excretion of bilirubin (a product of broken-down red blood cells), cholesterol, hormones, and drugs\n" +
                        "Breakdown of carbohydrates, fats, and proteins\n" +
                        "Activation of enzymes, which are specialized proteins essential to body functions\n" +
                        "Storage of glycogen (a form of sugar), minerals, and vitamins (A, D, E, and K)\n" +
                        "Synthesis of blood proteins, such as albumin\n" +
                        "Synthesis of clotting factors"
                        , "The type of virus that's causing your hepatitis affects how severe your disease is and how long it lasts.\n" +
                        "\n" +
                        "Hepatitis A. You usually get it when you eat or drink something that's got the virus in it. It's the least risky type because it almost always gets better on its own. It doesn't lead to long-term inflammation of your liver. Even so, about 20% of people who get hepatitis A get sick enough that they need to go to the hospital. There's a vaccine that can prevent it.\n" +
                        "\n" +
                        "Hepatitis B. This type spreads in several ways.You can get it from sex with someone who's sick or by sharing a needle when using street drugs. The virus also can pass from a mother to her newborn child at birth or soon afterward. Most adults with hepatitis B get better, but a small percentage can't shake the disease and become carriers, which means they can spread it to others even when their own symptoms disappear.\n" +
                        "\n" +
                        "Hepatitis C. You get this type if you have contact with contaminated blood or needles used to inject illegal drugs or draw tattoos.Sometimes you don't get any symptoms, or just mild ones. But in some cases hepatitis C leads to cirrhosis, a risky scarring of your liver.\n" +
                        "\n" +
                        "Hepatitis D happens only if you're already infected with hepatitis B. It tends to make that disease more severe.\n" +
                        "\n" +
                        "Hepatitis E mainly spreads in Asia, Mexico, India, and Africa. The few cases that show up in the U.S. are usually in people who return from a country where there are outbreaks of the disease.\n" +
                        "\n" +
                        "Like hepatitis A, you usually get it by eating or drinking something that's been contaminated with the virus.\n"
                        , "If you have infectious forms of hepatitis that are chronic, like hepatitis B and C, you may not have symptoms in the beginning. Symptoms may not occur until the damage affects liver function.\n" +
                        "\n" +
                        "Signs and symptoms of acute hepatitis appear quickly. They include:\n" +
                        "\n" +
                        "1. Fatigue\n" +
                        "2. Flu-like symptoms\n" +
                        "3. Dark urine\n" +
                        "4. Pale stool\n" +
                        "5. Abdominal pain\n" +
                        "6. Loss of appetite\n" +
                        "7. Unexplained weight loss\n" +
                        "8. Yellow skin and eyes, which may be signs of jaundice\n" +
                        "9. Chronic hepatitis develops slowly, so these signs and symptoms may be too subtle to notice\n"
                        , "-> Eat regular, balanced meals\n" +
                        "-> Maintain healthy calorie intake\n" +
                        "-> Eat whole-grain cereals, breads, and grains\n" +
                        "-> Eat lots of fruits and vegetables\n" +
                        "-> Get adequate protein\n" +
                        "-> Go easy on fatty, salty, and sugary foods\n" +
                        "-> Drink enough fluids\n" +
                        "-> Reach and maintain a healthy weight"
                        , "Practicing good hygiene is one key way to avoid contracting hepatitis A and E. If you’re traveling to a developing country, you should avoid:\n" +
                        "\n" +
                        "-> Local water\n" +
                        "-> Ice\n" +
                        "-> Raw or undercooked shellfish and oysters\n" +
                        "-> Raw fruit and vegetables\n" +
                        "Hepatitis B, C, and D contracted through contaminated blood can be prevented by:\n" +
                        "\n" +
                        "-> Not sharing drug needles\n" +
                        "-> Not sharing razors\n" +
                        "-> Not using someone else’s toothbrush\n" +
                        "-> Not touching spilled blood"),
                new diseaseEntity("Ulcerative Colitis", "Ulcerative colitis (UL-sur-uh-tiv koe-LIE-tis) is an inflammatory bowel disease (IBD) that causes long-lasting inflammation and ulcers (sores) in your digestive tract. Ulcerative colitis affects the innermost lining of your large intestine (colon) and rectum. Symptoms usually develop over time, rather than suddenly. Ulcerative colitis can be debilitating and can sometimes lead to life-threatening complications. While it has no known cure, treatment can greatly reduce signs and symptoms of the disease and even bring about long-term remission."
                        , "The exact cause of ulcerative colitis remains unknown. Previously, diet and stress were suspected, but now doctors know that these factors may aggravate but don't cause ulcerative colitis. One possible cause is an immune system malfunction. When your immune system tries to fight off an invading virus or bacterium, an abnormal immune response causes the immune system to attack the cells in the digestive tract, too.\n" +
                        "Heredity also seems to play a role in that ulcerative colitis is more common in people who have family members with the disease. However, most people with ulcerative colitis don't have this family history.\n"
                        , "Ulcerative colitis symptoms can vary, depending on the severity of inflammation and where it occurs. Signs and symptoms may include:\n" +
                        "\n" +
                        "1. Diarrhea, often with blood or pus\n" +
                        "2. Abdominal pain and cramping\n" +
                        "3. Rectal pain\n" +
                        "4. Rectal bleeding — passing small amount of blood with stool\n" +
                        "5. Urgency to defecate\n" +
                        "6. Inability to defecate despite urgency\n" +
                        "7. Weight loss\n" +
                        "8. Fatigue\n" +
                        "9. Fever\n" +
                        "10. In children, failure to grow\n"
                        , "The following are foods that are recommended on the low-residue diet. Remember that some of these foods can still trigger flare-ups, so you may need to make some adjustments or speak to your doctor and dietitian about alternatives.\n" +
                        "\n" +
                        "1. Dairy: up to 2 cups of milk, cottage cheese, pudding, or yogurt per day \n" +
                        "2. Grains: refined white breads, pasta, crackers, and dry cereals that have less than 1/2 a gram of fiber per serving  \n" +
                        "3. Meats and other Proteins: soft and tender cooked meats, such as poultry, eggs, pork, and fish; smooth peanut and nut butter\n" +
                        "4. Fruits: fruit juices with no pulp; canned fruits and applesauce, not including pineapple; raw, ripe bananas, melon, cantaloupe, watermelon, plums, peaches, and apricots\n" +
                        "5. Vegetables: raw lettuce, cucumbers, zucchini, and onion; cooked spinach, pumpkin, seedless yellow squash, carrots, eggplant, potatoes, and green and wax beans\n" +
                        "6. Fats and sauces: butter, margarine, mayonnaise, oils, smooth sauces, and dressings (not tomato); whipped cream; smooth condiments\n"
                        , "Avoid the following foods while on a low-residue diet:\n" +
                        "\n" +
                        "1. Deli meats\n" +
                        "2. Dry fruits, berries, figs, prunes, and prune juice\n" +
                        "3. Raw vegetables not mentioned in the list above\n" +
                        "4. Spicy sauces, dressings, pickles, and relishes with chunks\n" +
                        "5. Nuts, seeds, and popcorn\n" +
                        "6. Foods and beverages that contain caffeine, cocoa, and alcohol"),
                new diseaseEntity("Diabetes", "Diabetes mellitus is a group of metabolic diseases characterized by high blood sugar (glucose) levels that result from defects in insulin secretion, or its action, or both. Diabetes mellitus, commonly referred to as diabetes (as it will be in this article) was first identified as a disease associated with \"sweet urine,\" and excessive muscle loss in the ancient world. Elevated levels of blood glucose (hyperglycemia) lead to spillage of glucose into the urine, hence the term sweet urine.\n" +
                        "\n" +
                        "Normally, blood glucose levels are tightly controlled by insulin, a hormone produced by the pancreas. Insulin lowers the blood glucose level. When the blood glucose elevates (for example, after eating food), insulin is released from the pancreas to normalize the glucose level by promoting the uptake of glucose into body cells. In patients with diabetes, the absence of insufficient production of or lack of response to insulin causes hyperglycemia. Diabetes is a chronic medical condition, meaning that although it can be controlled, it lasts a lifetime.",
                        "-> Insufficient production of insulin (either absolutely or relative to the body's needs), production of defective insulin (which is uncommon), or the inability of cells to use insulin properly and efficiently leads to hyperglycemia and diabetes.\n" +
                                "\n" +
                                "-> This latter condition affects mostly the cells of muscle and fat tissues, and results in a condition known as insulin resistance. This is the primary problem in type 2 diabetes.\n" +
                                "-> The absolute lack of insulin, usually secondary to a destructive process affecting the insulin-producing beta cells in the pancreas, is the main disorder in type 1 diabetes.\n" +
                                "-> In type 2 diabetes, there also is a steady decline of beta cells that adds to the process of elevated blood sugars. Essentially, if someone is resistant to insulin, the body can, to some degree, increase production of insulin and overcome the level of resistance. After time, if production decreases and insulin cannot be released as vigorously, hyperglycemia develops.",
                        "1. The early symptoms of untreated diabetes are related to elevated blood sugar levels, and loss of glucose in the urine. High amounts of glucose in the urine can cause increased urine output (frequent urination) and lead to dehydration.\n" +
                                "2. The dehydration also causes increased thirst and water consumption.\n" +
                                "3. A relative or absolute insulin deficiency eventually leads to weight loss.\n" +
                                "4. The weight loss of diabetes occurs despite an increase in appetite.\n" +
                                "5. Some untreated diabetes patients also complain of fatigue.\n" +
                                "6. Nausea and vomiting can also occur in patients with untreated diabetes.\n" +
                                "7. Frequent infections (such as infections of the bladder, skin, and vaginal areas) are more likely to occur in people with untreated or poorly-controlled diabetes.\n" +
                                "8. Fluctuations in blood glucose levels can lead to blurred vision.\n" +
                                "9. Extremely elevated glucose levels can lead to lethargy and coma.",
                        "Make your calories count with these nutritious foods:\n" +
                                "\n" +
                                "1. Healthy carbohydrates: During digestion, sugars (simple carbohydrates) and starches (complex carbohydrates) break down into blood glucose. Focus on the healthiest carbohydrates, such as fruits, vegetables, whole grains, legumes (beans, peas and lentils) and low-fat dairy products.\n" +
                                "2. Fiber-rich foods: Dietary fiber includes all parts of plant foods that your body can't digest or absorb. Fiber moderates how your body digests and helps control blood sugar levels. Foods high in fiber include vegetables, fruits, nuts, legumes (beans, peas and lentils), whole-wheat flour and wheat bran.\n" +
                                "3. Heart-healthy fish: Eat heart-healthy fish at least twice a week. Fish can be a good alternative to high-fat meats. For example, cod, tuna and halibut have less total fat, saturated fat and cholesterol than do meat and poultry. Fish such as salmon, mackerel, tuna, sardines and bluefish are rich in omega-3 fatty acids, which promote heart health by lowering blood fats called triglycerides.\n" +
                                "\n" +
                                "4. Avoid fried fish and fish with high levels of mercury, such as tilefish, swordfish and king mackerel.\n" +
                                "\n" +
                                "\"5. Good\" fats. Foods containing monounsaturated and polyunsaturated fats can help lower your cholesterol levels. These include avocados, almonds, pecans, walnuts, olives, and canola, olive and peanut oils. But don't overdo it, as all fats are high in calories.\n",
                        "Diabetes increases your risk of heart disease and stroke by accelerating the development of clogged and hardened arteries. Foods containing the following can work against your goal of a heart-healthy diet:\n" +
                                "\n" +
                                "1. Saturated fats: High-fat dairy products and animal proteins such as beef, hot dogs, sausage and bacon contain saturated fats.\n" +
                                "2. Trans fats: These types of fats are found in processed snacks, baked goods, shortening and stick margarines. Avoid these items.\n" +
                                "3. Cholesterol: Sources of cholesterol include high-fat dairy products and high-fat animal proteins, egg yolks, liver, and other organ meats. Aim for no more than 200 milligrams (mg) of cholesterol a day.\n" +
                                "4. Sodium: Aim for less than 2,300 mg of sodium a day. However, if you also have hypertension, you should aim for less than 1,500 mg of sodium a day."),
                new diseaseEntity("Anemia",
                        "Anemia is a condition that develops when your blood lacks enough healthy red blood cells or hemoglobin. Hemoglobin is a main part of red blood cells and binds oxygen. If you have too few or abnormal red blood cells, or your hemoglobin is abnormal or low, the cells in your body will not get enough oxygen.\n" +
                                "\n" +
                                "Important factors to remember are:\n" +
                                "\n" +
                                "-> Certain forms of anemia are hereditary and infants may be affected from the time of birth.\n" +
                                "-> Women in the childbearing years are particularly susceptible to iron-deficiency anemia because of the blood loss from menstruation and the increased blood supply demands during pregnancy.\n" +
                                "-> Older adults also may have a greater risk of developing anemia because of poor diet and other medical conditions.\n" +
                                "-> There are many types of anemia. All are very different in their causes and treatments. Iron-deficiency anemia, the most common type, is very treatable with diet changes and iron supplements. Some forms of anemia -- like the mild anemia that develops during pregnancy -- are even considered normal. However, some types of anemia may present lifelong health problems.",
                        "Anemia occurs when your blood doesn't have enough red blood cells. This can happen if:\n" +
                                "\n" +
                                "-> Your body doesn't make enough red blood cells\n" +
                                "-> Bleeding causes you to lose red blood cells more quickly than they can be replaced\n" +
                                "-> Your body destroys red blood cells\n",
                        "The most common symptom of all types of anemia is a feeling of fatigue and a lack of energy.\n" +
                                "\n" +
                                "Other common symptoms may include:\n" +
                                "\n" +
                                "1. Paleness of skin\n" +
                                "2. Fast or irregular heartbeat\n" +
                                "3. Shortness of breath\n" +
                                "4. Chest pain\n" +
                                "5. Headache\n" +
                                "6. Light-headedness\n" +
                                "In mild cases, there may be few or no symptoms.\n" +
                                "\n" +
                                "Some forms of anemia can have specific symptoms:\n" +
                                "\n" +
                                "1. Aplastic anemia: fever, frequent infections, and skin rashes\n" +
                                "2. Folic acid deficiency anemia: irritability, diarrhea, and a smooth tongue\n" +
                                "3. Hemolytic anemia: jaundice, dark colored urine, fever, and abdominal pains\n" +
                                "4. Sickle cell anemia: painful swelling of the feet and hands, fatigue, and jaundice",
                                "If the anemia is caused by nutritional deficiencies, a change to an iron-rich diet can help alleviate the symptoms. The following foods are high in iron:\n" +
                                "\n" +
                                "1. Iron-fortified cereals and breads\n" +
                                "2. Dark-green leafy vegetables, for instance, curly kale and watercress\n" +
                                "3. Pulses and beans\n" +
                                "4. Brown rice\n" +
                                "5. White and red meats\n" +
                                "6. Nuts and seeds\n" +
                                "7. Fish\n" +
                                "8. Tofu\n" +
                                "9. Eggs\n" +
                                "10. Dried fruits, including apricots, raisins, and prunes",
                        "Eat a vitamin-rich diet\n" +
                                "Many types of anemia can't be prevented. But iron deficiency anemia and vitamin deficiency anemias can be avoided by having a diet that includes a variety of vitamins and nutrients, including:\n" +
                                "\n" +
                                "-> Iron: Iron-rich foods include beef and other meats, beans, lentils, iron-fortified cereals, dark green leafy vegetables, and dried fruit.\n" +
                                "-> Folate: This nutrient, and its synthetic form folic acid, can be found in fruits and fruit juices, dark green leafy vegetables, green peas, kidney beans, peanuts, and enriched grain products, such as bread, cereal, pasta and rice.\n" +
                                "-> Vitamin B-12: Foods rich in vitamin B-12 include meat, dairy products, and fortified cereal and soy products.\n" +
                                "-> Vitamin C: Foods rich in vitamin C include citrus fruits and juices, peppers, broccoli, tomatoes, melons and strawberries. These items help increase iron absorption.\n" +
                                "Consider a multivitamin\n" +
                                "--If you're concerned about getting enough vitamins from the food you eat, ask your doctor whether a multivitamin may be right for you.\n" +
                                "\n" +
                                "Consider genetic counseling\n" +
                                "--If you have a family history of an inherited anemia, such as sickle cell anemia or thalassemia, talk to your doctor and possibly a genetic counselor about your risk and what risks you may pass on to your children.\n" +
                                "\n" +
                                "-> Prevent malaria:\n" +
                                "Anemia can be a complication of malaria. If you plan on traveling to a place where malaria is common, talk with your doctor beforehand about taking preventive drugs. In areas where malaria is common, prevention involves reducing exposure to mosquitoes, for example, by using bed nets treated with insecticide."),
                new diseaseEntity("Renal Disease",
                        "Chronic kidney disease, also called chronic kidney failure, describes the gradual loss of kidney function. Your kidneys filter wastes and excess fluids from your blood, which are then excreted in your urine. When chronic kidney disease reaches an advanced stage, dangerous levels of fluid, electrolytes and wastes can build up in your body.\n" +
                                "\n" +
                                "In the early stages of chronic kidney disease, you may have few signs or symptoms. Chronic kidney disease may not become apparent until your kidney function is significantly impaired.\n" +
                                "\n" +
                                "Treatment for chronic kidney disease focuses on slowing the progression of the kidney damage, usually by controlling the underlying cause. Chronic kidney disease can progress to end-stage kidney failure, which is fatal without artificial filtering (dialysis) or a kidney transplant",
                        "Chronic kidney disease occurs when a disease or condition impairs kidney function, causing kidney damage to worsen over several months or years.\n" +
                                "\n" +
                                "Diseases and conditions that cause chronic kidney disease include:\n" +
                                "\n" +
                                "-Type 1 or type 2 diabetes\n" +
                                "-High blood pressure\n" +
                                "-Glomerulonephritis (gloe-mer-u-low-nuh-FRY-tis), an inflammation of the kidney's filtering units (glomeruli)\n" +
                                "-Interstitial nephritis (in-tur-STISH-ul nuh-FRY-tis), an inflammation of the kidney's tubules and surrounding structures\n" +
                                "-Polycystic kidney disease\n" +
                                "-Prolonged obstruction of the urinary tract, from conditions such as enlarged prostate, kidney stones and some cancers\n" +
                                "-Vesicoureteral (ves-ih-koe-yoo-REE-tur-ul) reflux, a condition that causes urine to back up into your kidneys\n" +
                                "-Recurrent kidney infection, also called pyelonephritis (pie-uh-low-nuh-FRY-tis)",
                        "Signs and symptoms of chronic kidney disease develop over time if kidney damage progresses slowly. Signs and symptoms of kidney disease may include:\n" +
                                "\n" +
                                "1. Nausea\n" +
                                "2. Vomiting\n" +
                                "3. Loss of appetite\n" +
                                "4. Fatigue and weakness\n" +
                                "5. Sleep problems\n" +
                                "6. Changes in how much you urinate\n" +
                                "7. Decreased mental sharpness\n" +
                                "8. Muscle twitches and cramps\n" +
                                "9. Swelling of feet and ankles\n" +
                                "10. Persistent itching\n" +
                                "11. Chest pain, if fluid builds up around the lining of the heart\n" +
                                "12. Shortness of breath, if fluid builds up in the lungs\n" +
                                "13. High blood pressure (hypertension) that's difficult to control\n" +
                                "14. Signs and symptoms of kidney disease are often nonspecific, meaning they can also be caused by other illnesses. Because your kidneys are highly adaptable and able to compensate for lost function, signs and symptoms may not appear until irreversible damage has occurred.",
                        "With all meal plans, including the kidney-friendly diet, you need to track how much of certain nutrients you take in, such as:\n" +
                                "\n" +
                                "-> Calories\n" +
                                "-> Protein\n" +
                                "-> Fat\n" +
                                "-> Carbohydrates\n" +
                                "-> Bread\n" +
                                "-> Fruits\n" +
                                "-> Vegetables\n" +
                                "-> Pasta and rice\n" +
                                "-> Red meat\n" +
                                "-> Poultry\n" +
                                "-> Fish\n" +
                                "-> Eggs\n" +
                                "-> Olive oil\n" +
                                "-> Peanut oil\n" +
                                "-> Corn oil\n" +
                                "-> Butter\n" +
                                "-> Lard\n" +
                                "-> Shortening\n" +
                                "-> Meats",
                        "To reduce your risk of developing kidney disease:\n" +
                                "\n" +
                                "Follow instructions on over-the-counter medications. When using nonprescription pain relievers, such as aspirin, ibuprofen (Advil, Motrin IB, others) and acetaminophen (Tylenol, others), follow the instructions on the package. Taking too many pain relievers could lead to kidney damage and generally should be avoided if you have kidney disease. Ask your doctor whether these drugs are safe for you.\n" +
                                "Maintain a healthy weight. If you're at a healthy weight, work to maintain it by being physically active most days of the week. If you need to lose weight, talk with your doctor about strategies for healthy weight loss. Often this involves increasing daily physical activity and reducing calories.\n" +
                                "\n" +
                                "Don't smoke. Cigarette smoking can damage your kidneys and make existing kidney damage worse. If you're a smoker, talk to your doctor about strategies for quitting smoking. Support groups, counseling and medications can all help you to stop.\n" +
                                "Manage your medical conditions with your doctor's help. If you have diseases or conditions that increase your risk of kidney disease, work with your doctor to control them. Ask your doctor about tests to look for signs of kidney damage.\n"),
                new diseaseEntity("Thyroid Disease",
                        "Thyroid disorders are conditions that affect the thyroid gland, a butterfly-shaped gland in the front of the neck. The thyroid has important roles to regulate numerous metabolic processes throughout the body. Different types of thyroid disorders affect either its structure or function.\n" +
                                "\n" +
                                "The thyroid gland is located below the Adam's apple wrapped around the trachea (windpipe). A thin area of tissue in the gland's middle, known as the isthmus, joins the two thyroid lobes on each side. The thyroid uses iodine to produce vital hormones. Thyroxine, also known as T4, is the primary hormone produced by the gland. After delivery via the bloodstream to the body's tissues, a small portion of the T4 released from the gland is converted to triiodothyronine (T3), which is the most active hormone.\n" +
                                "\n" +
                                "The function of the thyroid gland is regulated by a feedback mechanism involving the brain. When thyroid hormone levels are low, the hypothalamus in the brain produces a hormone known as thyrotropin releasing hormone (TRH) that causes the pituitary gland (located at the base of the brain) to release thyroid stimulating hormone (TSH). TSH stimulates the thyroid gland to release more T4.\n" +
                                "\n" +
                                "Since the thyroid gland is controlled by the pituitary gland and hypothalamus, disorders of these tissues can also affect thyroid function and cause thyroid problems.",
                        "Some common causes of hypothyroidism include:\n" +
                                "\n" +
                                "-> Hashimoto's thyroiditis (an autoimmune condition that causes inflammation of the thyroid gland)\n" +
                                "-> Thyroid hormone resistance\n" +
                                "-> Other types of thyroiditis (inflammation of the thyroid), such as acute thyroiditis and postpartum thyroiditis\n" +
                                "-> Graves disease\n" +
                                "-> Toxic multinodular goiter\n" +
                                "-> Thyroid nodules that overexpress thyroid hormone (known as \"hot\" nodules)\n",
                        "Hypothyroidism results from the thyroid gland producing an insufficient amount of thyroid hormone. It can develop from problems within the thyroid gland, pituitary gland, or hypothalamus. Symptoms of hypothyroidism can include:\n" +
                                "\n" +
                                "1. Fatigue\n" +
                                "2. Poor concentration or feeling mentally \"foggy\"\n" +
                                "3. Dry skin\n" +
                                "4. Constipation\n" +
                                "5. Feeling cold\n" +
                                "6. Fluid retention\n" +
                                "7. Muscle and joint aches\n" +
                                "8. Depression\n" +
                                "9. Prolonged or excessive menstrual bleeding in women",
                        "Here are the top foods in a hypothyroidism diet to start the healing process:\n" +
                                "\n" +
                                "Wild-caught fish — These provide the omega-3 fatty acids EPA and DHA, essential for hormone balance and thyroid function. Balancing the level of omega-3 to omega-6 fatty acids in your hypothyroidism diet can reduce inflammation and support healthy neurological function. Fish such as wild-caught Alaskan salmon, Atlantic mackerel and Pacific sardines are some of the best sources of omega-3’s to increase neurotransmitter activity and support a healthy mood and immune system. Just be aware of the fish you should never eat and choose the best varieties available.\n" +
                                "\n" +
                                "Coconut oil — This provides medium-chain fatty acids in the form of caprylic acid, lauric acid and capric acid, which support a healthy metabolism, increase energy and fight fatigue. A staple of the hypothyroidism diet, coconut oil is easy to digest, nourishes the digestive system and has antimicrobial, antioxidant and antibacterial properties that suppress inflammation. Coconut oil helps improve immunity and can increase brain function, endurance and mood while stabilizing blood sugar levels.\n" +
                                "\n" +
                                "Seaweed — Good seaweeds are some of the best natural sources of iodine and help prevent deficiencies that disturb thyroid function. I’d recommend having some every week as part of your hypothyroidism diet. Try kelp, nori, kombu and wakame. You can look for dried varieties of these at health food stores and use them in soups, with tuna fish or in fish cakes.\n" +
                                "\n" +
                                "Probiotic-Rich Foods — These include kefir (a fermented dairy product), organic goat’s milk yogurt, kimchi, kombucha, natto, sauerkraut and other fermented veggies. As part of your hypothyroidism diet, probiotics help create a healthy gut environment by balancing microflora bacteria. This reduces leaky gut syndrome, nutrient deficiencies, inflammation and autoimmune reactions.\n" +
                                "\n" +
                                "Sprouted Seeds — Flax, hemp and chia seeds provide ALA, a type of omega-3 fat that’s critical for proper hormonal balance and thyroid function. Adequate levels of fats in your hypothyroidism diet support a healthy mood and brain function while helping to lower inflammation. Eating plenty of healthy fats also stabilizes blood sugar levels and can help you stay at a healthy weight.\n" +
                                "\n" +
                                "Clean Water — Water helps with hydration and digestive function while preventing fatigue and moodiness. For prevention of constipation, low energy and sugar cravings, drink at least eight ounces every two hours.\n" +
                                "\n" +
                                "High Fiber Foods — People with hypothyroidism may have digestive difficulties, so aim for 30–40 grams of fiber daily. Not only does a high-fiber diet help with digestive health, it also improves heart health, balances blood sugar levels and supports a healthy weight by making you feel fuller. Some easy ways to increase fiber intake include eating more fresh vegetables, berries, beans, lentils and seeds.\n" +
                                "\n" +
                                "Bone broth — Beef and chicken stock contain the amino acids L-proline and L-glycine, which can help repair the digestive lining and improve hypothyroidism. Bone broth also contains numerous important minerals that nourish the digestive tract and prevent deficiencies like calcium, magnesium, phosphorus and silicon. Bone broth has been shown to help overcome food sensitivities, improve energy and fight fatigue, increase immunity and lower pain of the muscles and joints.\n" +
                                "\n" +
                                "Fruits and Vegetables — These are high in vitamins, minerals and antioxidants that are necessary for combating free-radical damage and lowering inflammation. They are nutrient-dense and should make up a large portion of a healthy diet since they support digestive health, brain function, heart health, hormone balance and a healthy weight.",
                        "Some items on this list may strike you as odd, like fiber and coffee, because for many other diets they're considered 'healthy' or ‘safe’ picks. You can still enjoy these foods groups, but moderating your intake is a good idea when managing hypothyroidism.\n" +
                                "\n" +
                                "But many of the others to watch out for already fall into the no-no category as part of a smart diet, so skipping them, or at least cutting way back, is definitely a no-brainer. These include fried fast-food meals, salty processed foods, sugary treats, such as pastry, cake, cookies, and ice cream, and excessive alcohol.\n" +
                                "Excessive iodine consumption"),
                new diseaseEntity("Heart Disease",
                        "Heart disease describes a range of conditions that affect your heart. Diseases under the heart disease umbrella include blood vessel diseases, such as coronary artery disease; heart rhythm problems (arrhythmias); and heart defects you're born with (congenital heart defects), among others.\n" +
                                "\n" +
                                "The term \"heart disease\" is often used interchangeably with the term \"cardiovascular disease.\" Cardiovascular disease generally refers to conditions that involve narrowed or blocked blood vessels that can lead to a heart attack, chest pain (angina) or stroke. Other heart conditions, such as those that affect your heart's muscle, valves or rhythm, also are considered forms of heart disease.\n",
                        "Common causes of abnormal heart rhythms (arrhythmias) or conditions that can lead to arrhythmias include:\n" +
                                "\n" +
                                "-Heart defects you're born with (congenital heart defects)\n" +
                                "-Coronary artery disease\n" +
                                "-High blood pressure\n" +
                                "-Diabetes\n" +
                                "-Smoking\n" +
                                "-Excessive use of alcohol or caffeine\n" +
                                "-Drug abuse\n" +
                                "-Stress\n" +
                                "-Some over-the-counter medications, prescription medications, dietary supplements and herbal remedies\n" +
                                "-Valvular heart disease\n" +
                                "\n" +
                                "In a healthy person with a normal, healthy heart, it's unlikely for a fatal arrhythmia to develop without some outside trigger, such as an electrical shock or the use of illegal drugs. That's primarily because a healthy person's heart is free from any abnormal conditions that cause an arrhythmia, such as an area of scarred tissue.\n" +
                                "\n" +
                                "However, in a heart that's diseased or deformed, the heart's electrical impulses may not properly start or travel through the heart, making arrhythmias more likely to develop.",
                        "Cardiovascular disease symptoms may be different for men and women. For instance, men are more likely to have chest pain; women are more likely to have other symptoms along with chest discomfort, such as shortness of breath, nausea and extreme fatigue.\n" +
                                "\n" +
                                "Symptoms can include:\n" +
                                "\n" +
                                "1. Pain, numbness, weakness or coldness in your legs or arms if the blood vessels in those parts of your body are narrowed\n" +
                                "2. Pain in the neck, jaw, throat, upper abdomen or back\n" +
                                "3. Fluttering in your chest\n" +
                                "4. Racing heartbeat (tachycardia)\n" +
                                "5. Slow heartbeat (bradycardia)\n" +
                                "6.Chest pain or discomfort\n" +
                                "7. Shortness of breath\n" +
                                "8. Lightheadedness\n" +
                                "9. Dizziness\n" +
                                "10. Fainting (syncope) or near fainting\n",
                        "These nine strategies will help you plan meals for someone with heart disease:\n" +
                                "\n" +
                                "1. Serve more vegetables, fruits, whole grains, and legumes. Just about everyone could stand to eat more plant-based foods. They're rich in fiber and other nutrients, and they can taste great in a salad, as a side dish, or as an entree. Watch that you don't use too much fat or cheese when you prepare them.\n" +
                                "\n" +
                                "2. Choose fat calories wisely by:\n" +
                                "\n" +
                                "Limit saturated fat (found in animal products).\n" +
                                "Avoid artificial trans fats as much as possible. Check ingredient lists for \"partially hydrogenated\" oils.\n" +
                                "When using added fats for cooking or baking, choose oils that are high in monounsaturated fat (for example, olive and peanut oil) or polyunsaturated fat (such as soybean, corn, and sunflower oils).\n" +
                                "\n" +
                                "3. Serve a variety of protein-rich foods. Balance meals with lean meat, fish, and vegetable sources of protein.\n" +
                                "\n" +
                                "4. Limit cholesterol. Cholesterol in foods, found in red meat and high-fat dairy products, can raise blood cholesterol levels, especially in high-risk people.\n" +
                                "\n" +
                                "5. Serve the right kind of carbs. Include foods like brown rice, oatmeal, quinoa, and sweet potatoes to add fiber and help control blood sugar levels. Avoid sugary foods.\n" +
                                "\n" +
                                "6. Eat regularly. This helps someone with heart disease control blood sugar, burn fat more efficiently, and regulate cholesterol levels.\n" +
                                "\n" +
                                "7. Cut back on salt. Too much salt is bad for blood pressure. Instead, use herbs, spices, or condiments to flavor foods.\n" +
                                "\n" +
                                "\n" +
                                "8. Encourage hydration. Staying hydrated makes you feel energetic and eat less. Encourage your loved one to drink 32 to 64 ounces (about 1 to 2 liters) of water daily, unless their doctor has told them to limit fluids.\n" +
                                "\n" +
                                "9. Keep serving sizes in check. It can help to use smaller plates and glasses, and to check food labels to see how much is in a serving, since it's easy to eat more than you think. Some guidelines:\n" +
                                "\n" +
                                "1 ounce of cheese is the size of a pair of dice.\n" +
                                "A serving of meat or tofu is the size of a deck of cards.\n" +
                                "2 servings of rice or pasta are the size of a tennis ball.\n" +
                                "\n",
                        "Certain types of heart disease, such as heart defects, can't be prevented. However, you can help prevent many other types of heart disease by making the same lifestyle changes that can improve your heart disease, such as:\n" +
                                "\n" +
                                "-Quit smoking\n" +
                                "-Control other health conditions, such as high blood pressure, high cholesterol and diabetes\n" +
                                "-Exercise at least 30 minutes a day on most days of the week\n" +
                                "-Eat a diet that's low in salt and saturated fat\n" +
                                "-Maintain a healthy weight\n" +
                                "-Reduce and manage stress\n" +
                                "-Practice good hygiene\n"),
                new diseaseEntity("Asthma",
                        "Asthma is a condition in which your airways narrow and swell and produce extra mucus. This can make breathing difficult and trigger coughing, wheezing and shortness of breath.\n" +
                                "\n" +
                                "For some people, asthma is a minor nuisance. For others, it can be a major problem that interferes with daily activities and may lead to a life-threatening asthma attack.\n" +
                                "\n" +
                                "Asthma can't be cured, but its symptoms can be controlled. Because asthma often changes over time, it's important that you work with your doctor to track your signs and symptoms and adjust treatment as needed\n",
                        "The exact cause of asthma isn't known. Researchers think some genetic and environmental factors interact to cause asthma, most often early in life. These factors include:\n" +
                                "\n" +
                                "-> An inherited tendency to develop allergies, called atopy (AT-o-pe)\n" +
                                "-> Parents who have asthma\n" +
                                "-> Certain respiratory infections during childhood\n" +
                                "-> Contact with some airborne allergens or exposure to some viral infections in infancy or in early childhood when the immune system is developing\n" +
                                "-> If asthma or atopy runs in your family, exposure to irritants (for example, tobacco smoke) may make your airways more reactive to substances in the air.\n" +
                                "\n" +
                                "Some factors may be more likely to cause asthma in some people than in others. Researchers continue to explore what causes asthma.\n",
                        "Asthma symptoms vary from person to person. You may have infrequent asthma attacks, have symptoms only at certain times — such as when exercising — or have symptoms all the time.\n" +
                                "\n" +
                                "Asthma signs and symptoms include:\n" +
                                "\n" +
                                "1. Shortness of breath\n" +
                                "2. Chest tightness or pain\n" +
                                "3. Trouble sleeping caused by shortness of breath, coughing or wheezing\n" +
                                "4. A whistling or wheezing sound when exhaling (wheezing is a common sign of asthma in children)\n" +
                                "5. Coughing or wheezing attacks that are worsened by a respiratory virus, such as a cold or the flu\n" +
                                "6. Signs that your asthma is probably worsening include:\n" +
                                "\n" +
                                "7. Asthma signs and symptoms that are more frequent and bothersome\n" +
                                "8. Increasing difficulty breathing (measurable with a peak flow meter, a device used to check how well your lungs are working)\n" +
                                "9. The need to use a quick-relief inhaler more often",
                        "Here's no asthma diet that will eliminate your symptoms. But these steps may help:\n" +
                                "\n" +
                                "-Eat to maintain a healthy weight. Being overweight can worsen asthma. Even losing a little weight can improve your symptoms. Learn how to eat right to maintain a healthy weight over the long term.\n" +
                                "-Eat plenty of fruits and vegetables. They're a good source of antioxidants such as beta carotene and vitamins C and E, which may help reduce lung swelling and irritation (inflammation) caused by cell-damaging chemicals known as free radicals.\n" +
                                "-Avoid allergy-triggering foods. Having asthma puts you at increased risk of having a food allergy. And allergic food reactions can cause asthma symptoms. In some people, exercising after eating an allergy-causing food leads to asthma symptoms.\n" +
                                "-Take in vitamin D. People with more severe asthma may have low vitamin D levels. Milk, eggs and fish such as salmon all contain vitamin D. Even spending a few minutes outdoors in the sun can increase vitamin D levels.\n" +
                                "-Avoid sulfites. Sulfites can trigger asthma symptoms in some people. Used as a preservative, sulfites can be found in wine, dried fruits, pickles, fresh and frozen shrimp, and some other foods.",
                        "While there's no way to prevent asthma, by working together, you and your doctor can design a step-by-step plan for living with your condition and preventing asthma attacks.\n" +
                                "\n" +
                                "Follow your asthma action plan. With your doctor and health care team, write a detailed plan for taking medications and managing an asthma attack. Then be sure to follow your plan.\n" +
                                "\n" +
                                "Asthma is an ongoing condition that needs regular monitoring and treatment. Taking control of your treatment can make you feel more in control of your life in general.\n" +
                                "\n" +
                                "Get vaccinated for influenza and pneumonia. Staying current with vaccinations can prevent flu and pneumonia from triggering asthma flare-ups.\n" +
                                "Identify and avoid asthma triggers. A number of outdoor allergens and irritants — ranging from pollen and mold to cold air and air pollution — can trigger asthma attacks. Find out what causes or worsens your asthma, and take steps to avoid those triggers.\n" +
                                "Monitor your breathing. You may learn to recognize warning signs of an impending attack, such as slight coughing, wheezing or shortness of breath. But because your lung function may decrease before you notice any signs or symptoms, regularly measure and record your peak airflow with a home peak flow meter.\n" +
                                "Identify and treat attacks early. If you act quickly, you're less likely to have a severe attack. You also won't need as much medication to control your symptoms.\n" +
                                "\n" +
                                "When your peak flow measurements decrease and alert you to an oncoming attack, take your medication as instructed and immediately stop any activity that may have triggered the attack. If your symptoms don't improve, get medical help as directed in your action plan.\n" +
                                "\n" +
                                "Take your medication as prescribed. Just because your asthma seems to be improving, don't change anything without first talking to your doctor. It's a good idea to bring your medications with you to each doctor visit, so your doctor can double-check that you're using your medications correctly and taking the right dose.\n" +
                                "Pay attention to increasing quick-relief inhaler use. If you find yourself relying on your quick-relief inhaler, such as albuterol, your asthma isn't under control. See your doctor about adjusting your treatment."),
                new diseaseEntity("Dengue Fever",
                        "Dengue (pronounced DENgee) fever is a painful, debilitating mosquito-borne disease caused by any one of four closely related dengue viruses. These viruses are related to the viruses that cause West Nile infection and yellow fever.\n" +
                                "\n" +
                                "Dengue fever is transmitted by the bite of an Aedes mosquito infected with a dengue virus. The mosquito becomes infected when it bites a person with dengue virus in their blood. It can’t be spread directly from one person to another person.\n" +
                                "\n" +
                                "Dengue (pronounced DENG-gay) can affect anyone but tends to be more severe in people with compromised immune systems. Because it is caused by one of five serotypes of the dengue virus, it is possible to get dengue fever multiple times. However, an attack of dengue produces immunity for a lifetime to that particular viral serotype to which the patient was exposed.",
                        "Dengue fever is caused by any one of four types of dengue viruses spread by mosquitoes that thrive in and near human lodgings. When a mosquito bites a person infected with a dengue virus, the virus enters the mosquito. When the infected mosquito then bites another person, the virus enters that person's bloodstream",
                        "Symptoms, which usually begin four to six days after infection and last for up to 10 days, may include\n" +
                                "\n" +
                                "1. Sudden, high fever\n" +
                                "2. Severe headaches\n" +
                                "3. Pain behind the eyes\n" +
                                "4. Severe joint and muscle pain\n" +
                                "5. Fatigue\n" +
                                "6. Nausea\n" +
                                "7. Vomiting\n" +
                                "8. Skin rash, which appears two to five days after the onset of fever\n" +
                                "9. Mild bleeding (such a nose bleed, bleeding gums, or easy bruising)\n",
                        "Healthy Food Diet For Dengue Patients includes:\n" +
                                "1. Orange\n" +
                                "2. Papaya\n" +
                                "3. Avoid Oily Food\n" +
                                "4. Porridge\n" +
                                "5. Herbal Tea\n" +
                                "6. Coconut Water\n" +
                                "7. Vegetable Juices\n" +
                                "8. Soup\n" +
                                "9. Fruit Juice\n" +
                                "10. Neem Leaves\n" +
                                "\n",
                        "There is no vaccine to prevent dengue fever. The best way to prevent the disease is to prevent bites by infected mosquitoes, particularly if you are living in or traveling to a tropical area. This involves protecting yourself and making efforts to keep the mosquito population down.\n" +
                                "\n" +
                                "To protect yourself:\n" +
                                "\n" +
                                "-Stay away from heavily populated residential areas, if possible.\n" +
                                "-Use mosquito repellents, even indoors.\n" +
                                "-When outdoors, wear long-sleeved shirts and long pants tucked into socks.\n" +
                                "-When indoors, use air conditioning if available.\n" +
                                "-Make sure window and door screens are secure and free of holes. If sleeping areas are not screened or air conditioned, use mosquito nets.\n" +
                                "-If you have symptoms of dengue, speak to your doctor."),
                new diseaseEntity("Food Poisioning",
                        "Foodborne illness, more commonly referred to as food poisoning, is the result of eating contaminated, spoiled, or toxic food. The most common symptoms of food poisoning include nausea, vomiting, and diarrhea.\n" +
                                "\n" +
                                "Although it’s quite uncomfortable, food poisoning isn’t unusual. According to the Centers for Disease Control and Prevention (CDC), 1 in 6 Americans will contract some form of food poisoning every year",
                        "Contamination of food can happen at any point of production: growing, harvesting, processing, storing, shipping or preparing. \n" +
                                "Cross-contamination — the transfer of harmful organisms from one surface to another — is often the cause. \n" +
                                "This is especially troublesome for raw, ready-to-eat foods, such as salads or other produce. Because these foods aren't cooked, harmful organisms aren't destroyed before eating and can cause food poisoning.\n" +
                                "Many bacterial, viral or parasitic agents cause food poisoning.",
                        "If you have food poisoning, chances are it won’t go undetected. Symptoms can vary depending on the source of the infection. The length of time it takes for symptoms to appear also depends on the source of the infection, but it can range from as little as 1 hour to as long as 28 days. Common cases of food poisoning will typically include at least three of the following symptoms:\n" +
                                "\n" +
                                "1. Abdominal cramps\n" +
                                "2. Diarrhea\n" +
                                "3. Vomiting\n" +
                                "4. Loss of appetite\n" +
                                "5. Mild fever\n" +
                                "6. Weakness\n" +
                                "7. Nausea\n" +
                                "8. Headaches\n" +
                                "\n" +
                                "Symptoms of potentially life-threatening food poisoning include:\n" +
                                "\n" +
                                "-Diarrhea persisting for more than three days\n" +
                                "-A fever higher than 101.5°F\n" +
                                "-Difficulty seeing or speaking\n" +
                                "-Symptoms of severe dehydration, which may include dry mouth, passing little to no urine, and difficulty keeping fluids down\n" +
                                "-Bloody urine\n" +
                                "-If you experience any of these symptoms, you should contact your doctor immediately.",
                        "It’s best to gradually hold off on solid foods until vomiting and diarrhea have passed and instead ease back to your regular diet by eating simple-to-digest foods that are bland and low in fat, such as:\n" +
                                "\n" +
                                "-Saltine crackers\n" +
                                "-Gelatin\n" +
                                "-Bananas\n" +
                                "-Rice\n" +
                                "-Oatmeal\n" +
                                "-Chicken broth\n" +
                                "-Bland potatoes\n" +
                                "-Boiled vegetables\n" +
                                "-Toast\n" +
                                "-Soda without caffeine (ginger ale, root beer)\n" +
                                "-Diluted fruit juices\n" +
                                "-Sport drinks\n",
                        "To prevent your stomach from getting more upset, try to avoid the following harder-to-digest foods, even if you think you feel better:\n" +
                                "\n" +
                                "-> Dairy products, especially milk and cheeses\n" +
                                "-> Fatty foods\n" +
                                "-> Highly seasoned foods\n" +
                                "-> Food with high sugar content\n" +
                                "-> Spicy foods\n" +
                                "-> Fried foods\n" +
                                "\n" +
                                "You should also avoid:\n" +
                                "\n" +
                                "-> Caffeine (soda, energy drinks, coffee)\n" +
                                "-> Alcohol\n" +
                                "-> Nicotine"),
                new diseaseEntity("High Blood Pressure",
                        "High blood pressure is a common condition in which the long-term force of the blood against your artery walls is high enough that it may eventually cause health problems, such as heart disease.\n" +
                                "\n" +
                                "Blood pressure is determined both by the amount of blood your heart pumps and the amount of resistance to blood flow in your arteries. The more blood your heart pumps and the narrower your arteries, the higher your blood pressure.\n" +
                                "\n" +
                                "You can have high blood pressure (hypertension) for years without any symptoms. Even without symptoms, damage to blood vessels and your heart continues and can be detected. Uncontrolled high blood pressure increases your risk of serious health problems, including heart attack and stroke.\n" +
                                "\n" +
                                "High blood pressure generally develops over many years, and it affects nearly everyone eventually. Fortunately, high blood pressure can be easily detected. And once you know you have high blood pressure, you can work with your doctor to control it.",
                        "An older man is having his blood pressure measured by a woman.\n" +
                                "The risk of developing hypertension increases as people age.\n" +
                                "The heart is a muscle that pumps blood around the body.\n" +
                                "\n" +
                                "Blood that has low oxygen levels is pumped towards the lungs, where oxygen supplies are replenished. The oxygen rich blood is then pumped by the heart around the body to supply our muscles and cells. The pumping of blood creates pressure.\n" +
                                "\n" +
                                "If a person has high blood pressure, it means that the walls of the arteries are receiving too much pressure on a constant basis.\n" +
                                "\n" +
                                "The causes of high blood pressure are divided into two categories:\n" +
                                "\n" +
                                "Essential high blood pressure: This has no established cause.\n" +
                                "Secondary high blood pressure: There is an underlying cause.\n" +
                                "Even though there is no identifiable cause for essential high blood pressure, there is strong evidence linking some risk factors to the likelihood of developing the condition.\n" +
                                "\n" +
                                "Most of the causes below are risk factors for essential high blood pressure. There are also examples of secondary high blood pressure:\n" +
                                "\n" +
                                "1) Age\n" +
                                "\n" +
                                "The older you are the higher your risk of having high blood pressure.\n" +
                                "\n" +
                                "2) Family history\n" +
                                "\n" +
                                "If you have close family members with hypertension, your chances of developing it are significantly higher. An international scientific study identified eight common genetic differences that may increase the risk of high blood pressure.\n" +
                                "\n" +
                                "3) Temperature\n" +
                                "\n" +
                                "A study that monitored 8,801 participants over the age of 65 found that systolic and diastolic blood pressure values differed significantly across the year and according to the distribution of outdoor temperature. Blood pressure was lower when it got warmer, and rose when it got colder.\n" +
                                "\n" +
                                "4) Ethnic background\n" +
                                "\n" +
                                "Evidence indicates that people with African or South Asian ancestry have a higher risk of developing hypertension, compared to people with predominantly Caucasian or Amerindian (indigenous of the Americas) ancestries.\n" +
                                "\n" +
                                "5) Obesity and overweight\n" +
                                "\n" +
                                "Both overweight and obese people are more likely to develop high blood pressure, compared to people of normal weight.\n" +
                                "\n" +
                                "6) Some aspects of gender\n" +
                                "\n" +
                                "In general, high blood pressure is more common among adult men than adult women. However, after the age of 60 years both men and women are equally susceptible.\n" +
                                "\n" +
                                "7) Physical inactivity\n" +
                                "\n" +
                                "Lack of exercise, as well as having a sedentary lifestyle, raises the risk of hypertension.\n" +
                                "\n" +
                                "8) Smoking\n" +
                                "\n" +
                                "Smoking causes the blood vessels to narrow, resulting in higher blood pressure. Smoking also reduces the blood's oxygen content so the heart has to pump faster in order to compensate, causing a rise in blood pressure.\n" +
                                "\n" +
                                "9) Alcohol intake\n" +
                                "\n" +
                                "People who drink regularly have higher systolic blood pressure than people who do not, according to researchers. They found that systolic blood pressure levels are about 7 millimeters of mercury (mmHg) higher in people who drink frequently than in people who do not drink.\n" +
                                "\n" +
                                "10) High salt intake\n" +
                                "\n" +
                                "Researchers reported that societies where people do not eat much salt have lower blood pressures than places where people eat a lot of salt.\n11) High fat diet\n" +
                                "\n" +
                                "Many health professionals say that a diet high in fat leads to a raised high blood pressure risk. However, most dietitians stress that the problem is not how much fat is consumed, but rather what type of fats.\n" +
                                "\n" +
                                "Fats sourced from plants such as avocados, nuts, olive oil, and omega oils are good for you. Saturated fats, which are common in animal-sourced foods, as well as trans fats, are bad for you.\n" +
                                "\n" +
                                "12) Mental stress\n" +
                                "\n" +
                                "Various studies have offered compelling evidence that mental stress, especially over the long term, can have a serious impact on blood pressure. One study suggested that the way that air traffic controllers handle stress can affect whether they are at risk of developing high blood pressure later in life.\n" +
                                "\n" +
                                "13) Diabetes\n" +
                                "\n" +
                                "People with diabetes are at a higher risk of developing hypertension. Among people with type 1 diabetes, high blood sugar is a risk factor for incident hypertension - effective and consistent blood sugar control, with insulin, reduces the long-term risk of developing hypertension.\n" +
                                "\n" +
                                "People with type 2 diabetes are at risk of hypertension due to high blood sugar, as well as other factors, such as overweight and obesity, certain medications, and some cardiovascular diseases.\n" +
                                "\n" +
                                "14) Psoriasis\n" +
                                "\n" +
                                "A study that followed 78,000 women for 14 years found that having psoriasis was linked to a higher risk of developing high blood pressure and diabetes. Psoriasis is an immune system condition that appears on the skin in the form of thick, red scaly patches.\n" +
                                "\n" +
                                "15) Pregnancy\n" +
                                "\n" +
                                "Pregnant women have a higher risk of developing hypertension than women of the same age who are not pregnant. It is the most common medical problem encountered during pregnancy, complicating 2 to 3 percent of all pregnancies.",
                        "Most people with high blood pressure will not experience any symptoms. It is often known as the \"silent killer\" for this reason.\n" +
                                "\n" +
                                "However, once blood pressure reaches about 180/110 mmHg, it is considered a medical emergency known as a hypertensive crisis. At this stage, symptoms will show, including:\n" +
                                "\n" +
                                "-Headache\n" +
                                "-Nausea\n" +
                                "-Vomiting\n" +
                                "-Dizziness\n" +
                                "-Blurred or double vision\n" +
                                "-Nosebleeds.\n" +
                                "-Palpitations, or irregular or forceful beating of the heart\n" +
                                "-Breathlessness\n" +
                                "\n" +
                                "Children with high blood pressure may have the following signs and symptoms:\n" +
                                "\n" +
                                "-Headache\n" +
                                "-Fatigue\n" +
                                "-Blurred vision\n" +
                                "-Nosebleeds\n" +
                                "-Bell's palsy, or an inability to control facial muscles on one side of the face.\n" +
                                "Newborns and very young babies with high blood pressure may experience the following signs and symptoms:\n" +
                                "\n" +
                                "-Failure to thrive\n" +
                                "-Seizure\n" +
                                "-Irritability\n" +
                                "-Lethargy\n" +
                                "-Respiratory distress",
                        "Eating a diet that is rich in whole grains, fruits, vegetables and low-fat dairy products and skimps on saturated fat and cholesterol can lower your blood pressure by up to 11 mm Hg if you have high blood pressure. This eating plan is known as the Dietary Approaches to Stop Hypertension (DASH) diet.\n" +
                                "\n" +
                                "It isn't easy to change your eating habits, but with these tips, you can adopt a healthy diet:\n" +
                                "\n" +
                                "Keep a food diary. Writing down what you eat, even for just a week, can shed surprising light on your true eating habits. Monitor what you eat, how much, when and why.\n" +
                                "Consider boosting potassium. Potassium can lessen the effects of sodium on blood pressure. The best source of potassium is food, such as fruits and vegetables, rather than supplements. Talk to your doctor about the potassium level that's best for you.\n" +
                                "Be a smart shopper. Read food labels when you shop and stick to your healthy-eating plan when you're dining out, too.\n",
                        "-> Don't add salt.\n" +
                                "-> Reduce sodium in your diet\n" +
                                "-> Eat fewer processed foods.\n" +
                                "-> Limit the amount of alcohol you drink\n" +
                                "-> Quit smoking\n" +
                                "-> Cut back on caffeine\n" +
                                "-> Reduce your stress"),
                new diseaseEntity("Mumps",
                        "Mumps is a contagious disease caused by a virus that passes from one person to another through saliva, nasal secretions, and close personal contact.\n" +
                                "\n" +
                                "The condition primarily affects the salivary glands, also called the parotid glands. These glands are responsible for producing saliva. There are three sets of salivary glands on each side of your face, located behind and below your ears. The hallmark symptom of mumps is swelling of the salivary glands.",
                        "The mumps virus is an enveloped single-stranded, linear negative-sense RNA virus of the genus Rubulavirus and family Paramyxovirus. The genome consists of 15,384 bases encoding nine proteins. Proteins involved in viral replication are the nucleoprotein, phosphoprotein, and polymerase protein while the genomic RNA forms the ribonucleocapsid. Humans are the only natural host for the virus.\n" +
                                "\n" +
                                "Mumps is spread from person to person through contact with respiratory secretions, such as saliva from an infected person. When an infected person coughs or sneezes, the droplets aerosolize and can enter the eyes, nose, or mouth of another person. Mumps can also be spread by sharing eating utensils or cups.The virus can also survive on surfaces and then be spread after contact in a similar manner. A person infected with mumps is contagious from approximately seven days before the onset of symptoms until about eight days after symptoms start. The incubation period (time until symptoms begin) can be from 12–25 days, but is typically 16–18 days.20-40 percent of persons infected with the mumps virus do not show symptoms, so it is possible to be infected and spread the virus without knowing it.",
                        "Symptoms of mumps usually appear within two weeks of exposure to the virus. Flu-like symptoms may be the first to appear, including:\n" +
                                "\n" +
                                "-Fatigue\n" +
                                "-Body aches\n" +
                                "-Headache\n" +
                                "-Loss of appetite\n" +
                                "-Low-grade fever\n" +
                                "A high fever of 103°F (39°C) and swelling of the salivary glands follow over the next few days. The glands may not all swell at once. More commonly, they swell and become painful periodically. You are most likely to pass the mumps virus to another person from the time you come into contact with the virus to when your parotid glands swell.\n" +
                                "\n" +
                                "Most people who contract mumps show symptoms of the virus. However, some people have no or very few symptoms.\n",
                        "-Avoid foods that require lots of chewing. \n" +
                                "-Instead, try broth-based soups or soft foods, such as mashed potatoes or cooked oatmeal, for nourishment. \n" +
                                "-Avoid sour foods, such as citrus fruits or juices, which stimulate saliva production",
                        "Vaccination can prevent mumps. Most infants and children receive a vaccine for measles, mumps, and rubella (MMR) at the same time. The first MMR shot is generally given between the ages of 12 and 15 months at a routine well-child visit. A second vaccination is necessary for school-aged children between 4 and 6 years old. With two doses, the mumps vaccine is approximately 88 percent effective. The rate of effectiveness of only one dose is about 78 percent.\n" +
                                "\n" +
                                "Adults who were born before 1957 and haven’t yet contracted mumps may wish to be vaccinated. Those who work in a high-risk environment, such as a hospital or school, should always be vaccinated against mumps.\n" +
                                "\n" +
                                "However, people who have compromised immune systems, are allergic to gelatin or neomycin, or are pregnant, shouldn’t receive the MMR vaccine. Consult your family doctor about an immunization schedule for you and your children."),
                new diseaseEntity("Tuberculosis",
                        "Tuberculosis (TB) is a disease caused by bacteria called Mycobacterium tuberculosis. The bacteria usually attack the lungs, but they can also damage other parts of the body.\n" +
                                "\n" +
                                "TB spreads through the air when a person with TB of the lungs or throat coughs, sneezes, or talks. If you have been exposed, you should go to your doctor for tests. You are more likely to get TB if you have a weak immune system.\n" +
                                "\n" +
                                "Through the air, just like a cold or the flu. When someone who’s sick coughs, sneezes, talks, laughs, or sings, tiny droplets that contain the germs are released. If you breathe in these nasty germs, you get infected.\n" +
                                "\n" +
                                "TB is contagious, but it’s not easy to catch. The germs grow slowly. You usually have to spend a lot of time around a person who has it. That’s why it’s often spread among co-workers, friends, and family members.\n" +
                                "\n" +
                                "\n" +
                                "Tuberculosis germs don’t thrive on surfaces. You can’t get the disease from shaking hands with someone who has it, or by sharing their food or drink",
                        "The Mycobacterium tuberculosis bacterium causes TB. It is spread through the air when a person with TB (whose lungs are affected) coughs, sneezes, spits, laughs, or talks.\n" +
                                "\n" +
                                "TB is contagious, but it is not easy to catch. The chances of catching TB from someone you live or work with are much higher than from a stranger. Most people with active TB who have received appropriate treatment for at least 2 weeks are no longer contagious.\n" +
                                "\n" +
                                "Since antibiotics began to be used to fight TB, some strains have become resistant to drugs. Multidrug-resistant TB (MDR-TB) arises when an antibiotic fails to kill all of the bacteria, with the surviving bacteria developing resistance to that antibiotic and often others at the same time.\n" +
                                "\n" +
                                "MDR-TB is treatable and curable only with the use of very specific anti-TB drugs, which are often limited or not readily available. In 2012, around 450,000 people developed MDR-TB.\n",
                        "Symptoms of TB in the lungs may include\n" +
                                "\n" +
                                "1. A bad cough that lasts 3 weeks or longer\n" +
                                "2. Weight loss\n" +
                                "3. Loss of appetite\n" +
                                "4. Coughing up blood or mucus\n" +
                                "5. Weakness or fatigue\n" +
                                "6. Fever\n" +
                                "7. Night sweats\n" +
                                "8. Skin tests, blood tests, x-rays, and other tests can tell if you have TB. If not treated properly, TB can be deadly. You can usually cure active TB by taking several medicines for a long period of time.",
                        "To give your body the vitamins, minerals, and other nutrients it needs to fight active tuberculosis and regain your strength and stamina, you need to eat a diet containing a variety of healthy foods, such as:\n" +
                                "\n" +
                                "-> Leafy, dark-colored greens like kale and spinach, for their high iron and B-vitamin content\n" +
                                "-> Plenty of whole grains, like whole wheat pastas, breads, and cereals\n" +
                                "-> Antioxidant-rich, brightly-colored vegetables, such as carrots, peppers, and squash, and fruits, like tomatoes, blueberries, and cherries think of buying produce in a full rainbow of colors\n" +
                                "-> Unsaturated fats like vegetable or olive oil, instead of butter\n",
                        "\n" +
                                "A few general measures can be taken to prevent the spread of active TB.\n" +
                                "\n" +
                                "Avoiding other people by not going to school or work, or sleeping in the same room as someone, will help to minimize the risk of germs from reaching anyone else.\n" +
                                "\n" +
                                "Wearing a mask, covering the mouth, and ventilating rooms can also limit the spread of bacteria.\n" +
                                "\n" +
                                "As is always the case for good health, there are certain foods you shouldn’t eat and substances you shouldn’t use.\n" +
                                "\n" +
                                "Skip tobacco in all forms.\n" +
                                "Don't drink alcohol — it can add to the risk of liver damage from some of the drugs used to treat your TB.\n" +
                                "Limit coffee and other caffeinated drinks.\n" +
                                "Limit refined products, like sugar, white breads, and white rice.\n" +
                                "Avoid high-fat, high-cholesterol red meat and instead load up on leaner protein sources like poultry, beans, tofu, and fish.\n")
        };
    }
}
