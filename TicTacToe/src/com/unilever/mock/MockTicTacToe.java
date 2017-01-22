package com.unilever.mock;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "mockTicTacToe")
public class MockTicTacToe
{
	private Mock mock;

    private PlayersDetails playersdetails;

    private String noOfPlayer;

    private String matSize;

    public MockTicTacToe() {
	}
    
    public MockTicTacToe(Mock mock, PlayersDetails playersdetails , String noOfPlayer, String matSize){
    	this.mock=mock;
    	this.playersdetails = playersdetails;
    	this.noOfPlayer = noOfPlayer;
    	this.matSize = matSize;
    	
    }   

    @XmlElement
    public Mock getMock ()
    {
        return mock;
    }

    public void setMock (Mock mock)
    {
        this.mock = mock;
    }

    @XmlElement
    public PlayersDetails getPlayersdetails ()
    {
        return playersdetails;
    }

    public void setPlayersdetails (PlayersDetails playersdetails)
    {
        this.playersdetails = playersdetails;
    }

    @XmlElement
    public String getNoOfPlayer ()
    {
        return noOfPlayer;
    }

    public void setNoOfPlayer (String noOfPlayer)
    {
        this.noOfPlayer = noOfPlayer;
    }

    @XmlElement
    public String getMatSize ()
    {
        return matSize;
    }

    public void setMatSize (String matSize)
    {
        this.matSize = matSize;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [mock = "+mock+", playersdetails = "+playersdetails+", noOfPlayer = "+noOfPlayer+", matSize = "+matSize+"]";
	}

}