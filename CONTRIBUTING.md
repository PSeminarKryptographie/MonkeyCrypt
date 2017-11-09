### So you'd like to contribute?
Great! We'd love your help, whether your just passing by or want to become a regular member of our team. However we are currently still a school project, so we can't accept help in all areas.
### Translating
As you might have noticed MonkeyCrypt is all in German … :beers: We would like to make MonkeyCrypt available in many other languages though. And this is where you come in.

#### A Good Translation…
+ is as close to the translated text as possible. This is especially important when translating from German to English, as many other translators will rely on the English version
+ has a good word flow, can be read comfortably in the language and doesn't sound weird.
+ doesn't include difficult words that children can't understand. This is an educational program!
+ includes translated ciphertexts. Sometimes we added ciphertext. If you're up for a challenge, decrypt it using MonkeyCrypt, translate it, and then encrypt it again.
+ uses the right **terminology**. The explanatory texts in German use specific terminology used in cryptology. This is often not translated correctly by translation programs or by people who have little experience in the area. A good way to find the correct terminology is to go to the wikipedia page in the original language, and then switch. E.g. Cryptography is not equal to cryptology!
+ is homogenous with other texts. Ok, this is the cherry on the cake. But a program shouldn't change the way it says things entirely every time. Check on other similar files and see how they formulate certain phrases (e.g. This encryption doesn't have a key vs. this encryption doesn't need a key) and stick to it or replace it.

#### Adding a new Language

The original texts can be found in the folder *src/text/de*. To create a folder with a new language, create a subfolder *src/text/<your language>*. The structure of the folder should be as the German one.
  
#### Adding Translations

In the folder:
*src/text/*
you can find many other folders named after languages. These folders have a lot of files in them . The aim im so to fill them with good translations in that language.
So:
+ fork the repository
+ open a txt file
+ replace the German text with an English (or other) translation **OR**
+ correct the English (or other) text with what you think is a better translation
+ submit a pull request

The original German texts (to compare translations) can be found in the folder *src/text/de* in the subfolders *did* or *hilfe*.

**CAREFUL!** The texts in the subfolder *did* are html pages. Try to respect the structure of the html page when translating.
**CAREFUL!** The texts in the subfolder *did_text* will eventually be the same as in *did*, only in txt form. So avoid redundant work by checking if translations have already been done in this text.

#### Creating pull requests
To decide whether to merge the translation, especially when it is not the only one available, it is important that you describe your commit by honestly telling us how good your translation is
("I speak German and English fluently" or "I'm not very good at German but I did my best translating it in Swedish" or "I used google translate")

#### Reviewing Translations
If you see a pull request translating into a language you speak, don't hesitate to check on the changes and leave a comment on whether you think this is a good translation!

### Submitting Ideas or issues
We know that our program is still full of issues and problems. So if you found one just by playing around with the program, feel free to open an issue for us! We'll try to fix it.
MonkeyCrypt is a work in progress, and we have a lot of ideas for the future. Maybe you have an idea for us too! Feel free to add it to our list in IDEAS.md
