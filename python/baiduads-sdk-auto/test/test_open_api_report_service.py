"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from openapireport.api.open_api_report_service import OpenApiReportService  # noqa: E501


class TestOpenApiReportService(unittest.TestCase):
    """OpenApiReportService unit test stubs"""

    def setUp(self):
        self.api = OpenApiReportService()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_report_task(self):
        """Test case for create_report_task

        """
        pass

    def test_get_report_data(self):
        """Test case for get_report_data

        """
        pass

    def test_get_task_status(self):
        """Test case for get_task_status

        """
        pass


if __name__ == '__main__':
    unittest.main()
