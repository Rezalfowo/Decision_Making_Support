from random import *
from pandas import *
from random import choice

# len_knowledge = 7
# len_attitude = 6
# len_behavior = 7
# len_hf_1 = 5

# def random_column(size):
#     col = []
#     for us in range(nb_user) :
#         col.append(randint(1,size))

#     return col

# def generate_df_dimensions(category,size):
#     return DataFrame(data={category+'_PR': random_column(size) ,
#                            category+'_DS':random_column(size),
#                            category+'_DF':random_column(size),
#                            category+'_EE':random_column(size),
#                            category+'_TB':random_column(size)})

# def generate_data(social_aspect):

#     #Generate data frames for Confidentiality, Integrity, Authenticity
#     df_c = generate_df_dimensions(social_aspect+"_C",len_hf_1)
#     df_i = generate_df_dimensions(social_aspect+"_I",len[x] + [randint(1, nb_grp)] + random_answers(param_opt)_hf_1)
#     df_a = generate_df_dimensions(social_aspect+"_A",len_hf_1)
#     # print(df_c)
#     #Concatenate data frames to return the dataFrame for one security aspect
#     frames = [df_c,df_i,df_a]
#     c_df = concat(frames, axis=1)

#     return c_df

# def generate_user():
#     #Knowledge
#     k_df = DataFrame(data=generate_data("SKILL"))
#     #Attitude
#     a_df = DataFrame(data=generate_data("EXPERIENCE"))
#     #Behavior
#     # b_df = DataFrame(data=generate_data("B"))
#     #Concat and differentiate per security aspect

#     return concat([k_df,a_df],axis=1)


# def write_to_csv(df,folder,filename):
#     #Writing to csv file
#     df.to_csv(f'{folder}{filename}.csv', encoding='utf-8',sep=";")

# #Creating tab
# nb_user = 2
# user_tab = generate_user()
# write_to_csv(user_tab,"generated_results/",f"data_sample_{nb_user}")


def random_answers(param_opt):
    arr_answers = []
    for key, value in param_opt.items():
        arr_answers.append(choice(value))
    return arr_answers


def generate_answers(nb_user, nb_grp, param_opt):
    df_data = DataFrame(columns=["User_ID", "Group"] + list(param_opt.keys()))
    for x in range(nb_user):
        df_data.loc[x] = [x] + [randint(1, nb_grp)] + random_answers(param_opt)
        # concat(df_data
        #     Series(
        #         [[x] + [randint(1, nb_grp)] + random_answers(param_opt)],
        #         index=df_data.columns,
        #         ignore_index=True,
        #     )
        # )

    return df_data


def write_to_csv(df, folder, filename):
    # Writing to csv file
    df.to_csv(f"{folder}{filename}.csv", encoding="utf-8", sep=",", index=False)


arr_parameter_options = {
    "ActiveEntity": ["Human User", "Processes", "Both"],
    "SufficientInformation": [
        "Smtg they know",
        "Smtg they are",
        "Smtg they have",
        "Smtg they know and smtg they have",
        "smtg they know and smtg they are",
    ],
    "SpecificSufficientInformation - have": ["Certificate", "Token", "Assertion"],
    "SpecificSufficientInformation - know": [
        "Text-password",
        "PIN",
        "Passphrase",
        "Pattern password",
    ],
    "SpecificSufficientInformation - are": [
        "Facial Recognition",
        "Iris",
        "Fingerprint",
        "Retina",
        "Voice",
    ],
}

# Nb user, nb group, nb parameter, array of parameters, array of options for each
write_to_csv(
    generate_answers(2, 2, arr_parameter_options),
    "generated_results/",
    f"data_sample_{2}_users_{2}_groups",
)
write_to_csv(
    generate_answers(5, 2, arr_parameter_options),
    "generated_results/",
    f"data_sample_{5}_users_{2}_groups",
)
write_to_csv(
    generate_answers(10, 2, arr_parameter_options),
    "generated_results/",
    f"data_sample_{10}_users_{2}_groups",
)
