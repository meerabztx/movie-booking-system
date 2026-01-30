package show.service;

import show.dao.ShowDAO;
import show.model.Show;

public class ShowService {
    ShowDAO dao = new ShowDAO();

    public void addShow(Show show) {
        dao.addShow(show);
    }

    public void viewShows() {
        dao.viewShows();
    }
}
