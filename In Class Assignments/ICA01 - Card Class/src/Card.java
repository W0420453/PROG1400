public class Card {
    int cardValue;
    String
    String cardName;
    String fileImage;

    /* Order of Suits : Hearts, Clubs, Diamonds, Spades */


        /* Determining Suit */

    }

    private void setCard(int num) {

        switch (num)
        {
            case 1:
                setName("Ace");
                setValue(num);
                setImgPath("ace.png");
                break;
            case 2:
                setName("Two");
                setValue(num);
                setImgPath("two.png");
                break;
            case 3:
                setName("Three");
                setValue(num);
                setImgPath("three.png");
                break;
            case 4:
                setName("Four");
                setValue(num);
                setImgPath("four.png");
                break;
            case 5:
                setName("Five");
                setValue(num);
                setImgPath("five.png");
                break;
            case 6:
                setName("Six");
                setValue(num);
                setImgPath("six.png");
                break;
            case 7:
                setName("Seven");
                setValue(num);
                setImgPath("seven.png");
                break;
            case 8:
                setName("Eight");
                setValue(num);
                setImgPath("eight.png");
                break;
            case 9:
                setName("Nine");
                setValue(num);
                setImgPath("nine.png");
                break;
            case 10:
                setName("Ten");
                setValue(num);
                setImgPath("ten.png");
                break;
            case 11:
                setName("Jack");
                setValue(10); /* Face Card*/
                setImgPath("jack.png");
                break;
            case 12:
                setName("Queen");
                setValue(10); /* Face Card*/
                setImgPath("queen.png");
                break;
            case 13:
                setName("King");
                setValue(10); /* Face Card*/
                setImgPath("king.png");
                break;
        }

        this.cardValue = cardValue;
        this.cardName = cardName;
        this.fileImage = fileImage;
    }

}
