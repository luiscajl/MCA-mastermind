package com.mca.mastermind.models.DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.mca.mastermind.models.SessionImplementation;
import com.mca.mastermind.models.StateValue;

public class SessionImplementationDAO {

    private static final String EXTENSION = ".mm";

    public static final String DIRECTORY = System.getProperty("user.dir")
            + "/MastermindSaves";

    private static File filePath;
    static {
        SessionImplementationDAO.filePath = new File(
                SessionImplementationDAO.DIRECTORY);
    }

    private SessionImplementation sessionImplementation;

    private GameDAO gameDAO;

    public void associate(SessionImplementation sessionImplementation) {
        this.sessionImplementation = sessionImplementation;
        this.gameDAO = new GameDAO(this.sessionImplementation.getGame());
    }

    public void load(String name) {
        this.sessionImplementation.setName(name);
        File file = new File(SessionImplementationDAO.filePath, name);
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(file));
            this.gameDAO.load(bufferedReader);
            this.sessionImplementation.resetRegistry();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.sessionImplementation.setStateValue(StateValue.IN_GAME);
        if (this.sessionImplementation.isLooser()
                || this.sessionImplementation.isWinner()) {
            this.sessionImplementation.setStateValue(StateValue.FINAL);
        }
    }

    public void save() {
        this.save(this.sessionImplementation.getName());
    }

    public void save(String name) {
        if (name.endsWith(SessionImplementationDAO.EXTENSION)) {
            name = name.replace(SessionImplementationDAO.EXTENSION, "");
        }
        File file = new File(SessionImplementationDAO.filePath,
                name + SessionImplementationDAO.EXTENSION);
        try {
            FileWriter fileWriter = new FileWriter(file);
            this.gameDAO.save(fileWriter);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getGamesNames() throws IOException {
        try {
            checkFilePath();
            if (filePath.list().length > 0) {
                return Arrays.asList(SessionImplementationDAO.filePath.list());
            } else {
                return new ArrayList<>();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public boolean exists(String name) throws IOException {
        for (String auxName : this.getGamesNames()) {
            if (auxName.equals(name + SessionImplementationDAO.EXTENSION)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo privado que comprueba si existe el path, si puede escribir y leer
     * 
     * @throws IOException
     * 
     * 
     */
    private boolean checkFilePath() throws IOException {
        if (!filePath.exists()) {
            if (!filePath.canRead() || !filePath.canWrite()) {
                throw new IOException("Can write or read on filepath "
                        + filePath.getAbsolutePath());
            } else {
                SessionImplementationDAO.filePath.getParentFile().mkdirs();
            }
            return true;
        } else {
            return true;
        }
    }
}
