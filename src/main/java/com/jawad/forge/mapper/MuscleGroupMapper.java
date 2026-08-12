package com.jawad.forge.mapper;

import com.jawad.forge.dto.MuscleGroupRequestDTO;
import com.jawad.forge.dto.MuscleGroupResponseDTO;
import com.jawad.forge.entity.MuscleGroup;
import org.springframework.stereotype.Component;

@Component
public class MuscleGroupMapper {
    public MuscleGroup toEntity(MuscleGroupRequestDTO dto) {
        MuscleGroup muscleGroup = new MuscleGroup();
        muscleGroup.setName(dto.name());
        return muscleGroup;
    }

    public MuscleGroupResponseDTO toResponse(MuscleGroup muscleGroup) {
        return new MuscleGroupResponseDTO(
                muscleGroup.getId(),
                muscleGroup.getName()
        );
    }
}
