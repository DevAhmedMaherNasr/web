import streamlit as st

st.title("البحث في صور الأسئلة")

# خانة البحث
query = st.text_input("اكتب جزء من السؤال:")

# قاعدة البيانات البسيطة (الكلمة ورابط الصورة أو اسمها)
questions = {
    "السؤال الأول": "q1.png",
    "السؤال الثاني": "q2.png"
}

if st.button("ابحث"):
    if query in questions:
        st.success("تم العثور على الإجابة:")
        st.image(questions[query], caption=query)
    else:
        st.error("عذراً، لم يتم العثور على سؤال مطابق.")
