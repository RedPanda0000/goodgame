package fourjo.idle.goodgame.gg.repository;

import fourjo.idle.goodgame.gg.web.dto.admin.AdminBoardDTO;
import fourjo.idle.goodgame.gg.web.dto.admin.AdminBoardSearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminRepository {

    public int boardInsertByUserIndex(AdminBoardDTO adminBoardDTO);

    public int boardUpdateByBoardIndex(AdminBoardDTO adminBoardDTO);

    public int boardDeleteByBoardIndex(int boardIndex);


    public List<AdminBoardDTO> boardSearchAll4pm(AdminBoardSearchDTO adminBoardSearchDTO);
}