package hole.detector.api.service;


import hole.detector.api.model.dto.HoleLocationDTO;
import hole.detector.api.model.entity.HoleLocationData;
import hole.detector.api.repository.HoleLocationDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HoleDetectorServices {

    private final HoleLocationDataRepository holeLocationDataRepository;

    public List<HoleLocationDTO> getAllHoleLocations(){

        List<HoleLocationDTO> holeLocation = new ArrayList<HoleLocationDTO>();
        holeLocation.add(new HoleLocationDTO(24.1111, 23.1111));
        holeLocation.add(new HoleLocationDTO(24.1111, 23.1111));
        holeLocation.add(new HoleLocationDTO(24.1111, 23.1111));

        var x = holeLocationDataRepository.findAll();


        return holeLocation;

    }

}
