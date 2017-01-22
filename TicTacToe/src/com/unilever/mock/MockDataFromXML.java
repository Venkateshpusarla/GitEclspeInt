package com.unilever.mock;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.unilever.view.Constants;

public class MockDataFromXML implements Constants {

	private final static MockDataFromXML mockXML = new MockDataFromXML();

	public MockTicTacToe getDataFromXML(String mockSize) {
		try {
			String fileName = "src/com/unilever/mock/MockTicTacToe";
			String extension = ".xml";
			if (!(mockSize != null && !mockSize.trim().isEmpty())) {
				mockSize = "";
			}
			File file = new File(fileName + mockSize + extension);
			JAXBContext jaxbContext = JAXBContext.newInstance(MockTicTacToe.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MockTicTacToe mockTicTacToe = (MockTicTacToe) jaxbUnmarshaller.unmarshal(file);
			if (mockTicTacToe != null) {
				return mockTicTacToe;
			}
		} catch (JAXBException e) {
			System.out.println(
					"XmlToObject.getCoordinatesByPosition() JAXBException mockSize " + mockSize + e.getMessage());
		}
		return null;
	}

	public String getCoordinatesByPosition(String coordinate, String playerName, Integer pos, String mockSize) {
		MockTicTacToe mockTicTacToe = mockXML.getDataFromXML(mockSize);
		if (mockTicTacToe != null) {
			Mock mock = mockTicTacToe.getMock();
			if (mock != null) {
				List<Position> positions = mock.getPosition();
				if (positions != null && !positions.isEmpty() && positions.size() > 0) {
					Integer matSize = Integer.parseInt(mockTicTacToe.getMatSize().split("/")[0]);
					if (pos < matSize * matSize) {
						Position position = positions.get(pos);
						if (Integer.parseInt(position.getValue()) == pos) {
							List<Player> players = position.getPlayer();
							if (players != null && !players.isEmpty() && players.size() > 0) {
								for (Player player : players) {
									if (player.getValue().equals(playerName)) {
										if (coordinate.equals(X_COORDINATE)) {
											return player.getXcod();
										} else if (coordinate.equals(Y_COORDINATE)) {
											return player.getYcod();
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public String getMatrixSize(String mockSize) {
		MockTicTacToe mockTicTacToe = mockXML.getDataFromXML(mockSize);
		if (mockTicTacToe != null) {
			return mockTicTacToe.getMatSize() != null ? mockTicTacToe.getMatSize() : null;
		}
		return null;
	}

	public String getNoOfPlayers(String mockSize) {
		MockTicTacToe mockTicTacToe = mockXML.getDataFromXML(mockSize);
		if (mockTicTacToe != null) {
			return mockTicTacToe.getNoOfPlayer() != null ? mockTicTacToe.getNoOfPlayer() : null;
		}
		return null;
	}

	public String getPlayerName(String mockSize, int playerNo) {
		MockTicTacToe mockTicTacToe = mockXML.getDataFromXML(mockSize);
		if (mockTicTacToe != null) {
			PlayersDetails playersDetails = mockTicTacToe.getPlayersdetails();
			if (playersDetails != null) {
				List<PlayerDetail> playerDetails = playersDetails.getPlayerDetail();
				if (playerDetails != null && !playerDetails.isEmpty() && playerDetails.size() > 0) {
					if (playerNo - 1 <= playerDetails.size()) {
						return playerDetails.get(playerNo).getPlayerName();
					}
				}
			}

		}
		return null;
	}

	public String getPlayerSymbol(String mockSize, int playerNo) {
		MockTicTacToe mockTicTacToe = mockXML.getDataFromXML(mockSize);
		if (mockTicTacToe != null) {
			PlayersDetails playersDetails = mockTicTacToe.getPlayersdetails();
			if (playersDetails != null) {
				List<PlayerDetail> playerDetails = playersDetails.getPlayerDetail();
				if (playerDetails != null && !playerDetails.isEmpty() && playerDetails.size() > 0) {
					if (playerNo <= playerDetails.size()) {
						return playerDetails.get(playerNo).getPlayerSymbol();
					}
				}
			}

		}
		return null;
	}

}