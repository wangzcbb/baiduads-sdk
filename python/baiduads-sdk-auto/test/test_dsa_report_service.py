"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import unittest

import baiduads
from dsareport.api.dsa_report_service import DSAReportService  # noqa: E501


class TestDSAReportService(unittest.TestCase):
    """DSAReportService unit test stubs"""

    def setUp(self):
        self.api = DSAReportService()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_creative_detail_report(self):
        """Test case for get_creative_detail_report

        """
        pass

    def test_get_creative_group_detail_report(self):
        """Test case for get_creative_group_detail_report

        """
        pass

    def test_get_creative_group_report(self):
        """Test case for get_creative_group_report

        """
        pass

    def test_get_product_detail_report(self):
        """Test case for get_product_detail_report

        """
        pass


if __name__ == '__main__':
    unittest.main()
