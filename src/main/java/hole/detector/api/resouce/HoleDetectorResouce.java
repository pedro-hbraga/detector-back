package hole.detector.api.resouce;


import hole.detector.api.model.dto.HoleLocationDTO;
import hole.detector.api.service.HoleDetectorServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/index")
@RequiredArgsConstructor
public class HoleDetectorResouce {

    private final HoleDetectorServices holeDetectorServices;

    @GetMapping(value = "/holes-locations")
    public ResponseEntity<List<HoleLocationDTO>> getAllHoleLocations(){
        return ResponseEntity.ok(holeDetectorServices.getAllHoleLocations());
    }
}
