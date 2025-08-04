package hu.yettel.homework.service.dto.external;

import org.springframework.http.HttpStatusCode;

public record ExternalApiResponse<B>(
    B body,
    HttpStatusCode statusCode
) {
}
